package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cd;
import model.bean.Cliente;

public class pedirDAO {
  



    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
           
            
       
                 
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Cliente p = new Cliente();
                
                p.setId_pedido(rs.getInt("id_cliente"));
                 p.setNome(rs.getString("nome"));
                 p.setEmail(rs.getString("email"));
                p.setPedido1(rs.getString("pedido1"));
                p.setPedido2(rs.getString("pedido2"));
                  clientes.add(p);
            }
            
            

        } catch (SQLException ex) {
            Logger.getLogger(pedirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
   

    public void update(Cliente p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET pedido1 = ?, pedido2 = ? WHERE id_cliente = ?");
           
            stmt.setString(1, p.getPedido1());
            stmt.setString(2, p.getPedido2());
           
            stmt.setInt(3, p.getId_pedido());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
   

}

    

