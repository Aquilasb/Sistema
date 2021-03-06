/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.clienteDAO;
import javax.swing.JOptionPane;
import model.bean.Cliente;

/**
 *
 * @author aluno-285
 */
public class ViewJTable_CLIENTE extends javax.swing.JFrame {

    /**
     * Creates new form ViewJTable_NOVO
     */
    public ViewJTable_CLIENTE() {
        initComponents();
        setIcon();
        DefaultTableModel modelo = (DefaultTableModel) jTCliente.getModel();
        jTCliente.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    

 
  public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTCliente.getModel();
        modelo.setNumRows(0);
        clienteDAO cdao = new clienteDAO();

        for (Cliente c : cdao.read()) {

            modelo.addRow(new Object[]{
                c.getId_cliente(),
                c.getNome(),
                c.getEmail()
              
                
            });

        }

    }
  public void readJTableForNom(String nom) {
    
        DefaultTableModel modelo = (DefaultTableModel) jTCliente.getModel();
        modelo.setNumRows(0);
        clienteDAO cdao = new clienteDAO();

        for (Cliente c : cdao.readForNom(nom)) {

            modelo.addRow(new Object[]{
                c.getId_cliente(),
                c.getNome(),
                c.getEmail()
              
                
            });

        }

    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtNome_pesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 90, -1));

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 600, 290));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, 21));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 162, 170, 30));

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 90, -1));

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Clientes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 269, 37));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 162, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, -1));

        txtNome_pesquisa.setToolTipText("Pesquisar por nome");
        txtNome_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo 04.jpg"))); // NOI18N
        jLabel6.setToolTipText("Digite o nome");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
         Cliente c = new Cliente();
        clienteDAO dao = new clienteDAO();
        
        
        
        c.setNome(txtNome.getText());
        c.setEmail(txtEmail.getText());
       
        
        
        dao.create(c);

       
        txtNome.setText(null);
        txtEmail.setText(null);
         
        

        readJTable();
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (jTCliente.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            clienteDAO dao = new clienteDAO();
            
            
            c.setNome(txtNome.getText());
            c.setEmail(txtEmail.getText());
            
            
            
            
            c.setId_cliente((int) jTCliente.getValueAt(jTCliente.getSelectedRow(), 0));
            
            
            
            dao.update(c);
            
            
            txtNome.setText(null);
            txtEmail.setText(null);
           
            

            readJTable();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked
        
        if (jTCliente.getSelectedRow() != -1) {
            
            txtNome.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 1).toString());
            txtEmail.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 2).toString());
            
            

        }
    }//GEN-LAST:event_jTClienteMouseClicked

    private void jTClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyReleased
        
        if (jTCliente.getSelectedRow() != -1) {
            
            txtNome.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 1).toString());
            txtEmail.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 2).toString());
            
            

        }
    }//GEN-LAST:event_jTClienteKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int sair = JOptionPane.showConfirmDialog(null,"Tem certeza de que deseja excluir?");
    int sairl = Integer.bitCount(sair);
    
    if(sairl == 0){ 
            if (jTCliente.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            clienteDAO dao = new clienteDAO();

            c.setId_cliente((int) jTCliente.getValueAt(jTCliente.getSelectedRow(), 0));
            
            dao.delete(c);

            txtNome.setText("");
            txtEmail.setText("");
            

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir.");
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        readJTableForNom(txtNome_pesquisa.getText());
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNome_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_pesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewJTable_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJTable_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJTable_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJTable_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJTable_CLIENTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome_pesquisa;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("snake21.png")));
    }
}
