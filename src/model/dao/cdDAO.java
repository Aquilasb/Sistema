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

public class cdDAO {
    public void create(Cd c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cd (nome,preco,descricao,quantidade)VALUES(?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getPreco());
            stmt.setString(3, c.getDescricao());
            stmt.setInt(4, c.getQuantidade());
            
            
            
            
            
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

        List<Cd> cds = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cd");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cd car = new Cd();

                car.setId_cd(rs.getInt("id_cd"));
                car.setNome(rs.getString("nome"));
                car.setPreco(rs.getString("preco"));
                car.setDescricao(rs.getString("descricao"));
                car.setQuantidade(rs.getInt("quantidade"));
                
                 cds.add(car);
            }

        } catch (SQLException ex) {
            Logger.getLogger(cdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cds;

    }
   
    public List<Cd> readForTi(String ti) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cd> cds = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cd WHERE nome LIKE ?");
            stmt.setString(1, "%"+ti+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cd car = new Cd();

                car.setId_cd(rs.getInt("id_cd"));
                car.setNome(rs.getString("nome"));
                car.setPreco(rs.getString("preco"));
                car.setDescricao(rs.getString("descricao"));
                car.setQuantidade(rs.getInt("quantidade"));
                
                 cds.add(car);
            }

        } catch (SQLException ex) {
            Logger.getLogger(cdDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cds;

    }

    public void update(Cd c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cd SET nome = ?, preco = ? ,descricao = ? ,quantidade = ?, numero_vendas=? WHERE id_cd = ?");
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getPreco());
            stmt.setString(3, c.getDescricao());
            stmt.setInt(4, c.getQuantidade());
            stmt.setInt(5, c.getNumero_vendas());
            stmt.setInt(6, c.getId_cd());
            
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
   
    public void delete(Cd c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cd WHERE id_cd = ?");
            stmt.setInt(1, c.getId_cd());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    }


