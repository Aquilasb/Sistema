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

public class venderDAO {

        public void create(Cd t) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cd (cpf_cliente, placa, data_troca, lucro)VALUES(?,?,?,?)");
            
            stmt.setInt(1, t.getId_cd());
            stmt.setString(2, t.getNome());
            stmt.setString(3, t.getPreco());
            stmt.setInt(4, t.getNumero_vendas());
            
           

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Cd> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cd> vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cd");
           rs = stmt.executeQuery();

           while (rs.next()) {

               Cd tro = new Cd();

                tro.setId_cd(rs.getInt("id_cd"));
                tro.setNome(rs.getString("nome"));
                tro.setPreco(rs.getString("preco"));
               tro.setQuantidade(rs.getInt("quantidade"));
                tro.setVendas(rs.getInt("numero_vendas"));
                
                
               vendas.add(tro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
       }

        return vendas;

    }
   

     public void update(Cd t) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cd SET quantidade = ?, numero_vendas = ? WHERE id_cd = ?");
            
            stmt.setInt(1, t.getContador());
            stmt.setInt(2, t.getNumero_vendas());
            stmt.setInt(3, t.getId_cd());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
  

}
