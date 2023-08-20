/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.UsuaFactory;
import java.util.List;
import java.util.Vector;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class ConsUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ConsUsuario
     */
    private boolean cadastro;
    private JTextField jtfUsuario;
    private JPasswordField jtfSenha;
    private JTextField jtfTipo;
    private JTextField jtfIdUsuario;
    private int row;
    
    public ConsUsuario() {
        initComponents();
        this.row = -1;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }
    
    public boolean getCadastro() {
        return this.cadastro;
    }
    
    public void setJtfUsuario(JTextField jtfUsuario) {
        this.jtfUsuario = jtfUsuario;
    }
    
    public void setJtfIdfUsuario(JTextField jtfIdUsuario) {
        this.jtfIdUsuario = jtfIdUsuario;
    }
    
    public void setJtfSenha(JPasswordField jtfSenha) {
        this.jtfSenha = jtfSenha;
    }
    
    public void setJtfTipo(JTextField jtfTipo) {
        this.jtfTipo = jtfTipo;
    }
    
    public void preencherTela(String usuario) {
        List<Usuario> list;
        
        if (usuario.equals(""))
           list = (List<Usuario>) new UsuaFactory().consultar("");
        else
           list = (List<Usuario>) new UsuaFactory().consultar(" where usuario like '"+usuario+"%'");
            
        String colunas[]   = {"ID", "Usuário", "Senha", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < list.size(); i++) {
            modelo.addRow(new String[]{
                list.get(i).getId().toString(), 
                list.get(i).getUsuario(), 
                list.get(i).getSenha(),
                String.valueOf(list.get(i).getTipo())});
        }
        jTable3.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnAtualizar = new java.awt.Button();
        lbPesquisar = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de usuários");
        setName("jfConsUsuario"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Senha", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setFocusable(false);
        jTable3.setName("jtUsuario"); // NOI18N
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jTable3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable3ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lbPesquisar.setText("Pesquisar:");

        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPesquisar)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.preencherTela("");
    }//GEN-LAST:event_formWindowOpened

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
       /* if (this.row == jTable3.getSelectedRow()) {
            DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
            Vector usuar = (Vector) modelo.getDataVector().get(jTable3.getSelectedRow());
            this.jtfIdUsuario.setText(usuar.get(0).toString());
            this.jtfUsuario.setText(usuar.get(1).toString());
            this.jtfSenha.setText(usuar.get(2).toString());
            this.jtfTipo.setText(usuar.get(3).toString());
        }
        this.row = jTable3.getSelectedRow();*/
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        this.preencherTela("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jtfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyPressed
      //  this.preencherTela(jtfPesquisar.getText() + evt.getKeyChar());
    }//GEN-LAST:event_jtfPesquisarKeyPressed

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
        this.preencherTela(jtfPesquisar.getText());
    }//GEN-LAST:event_jtfPesquisarKeyReleased

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        if (this.row == jTable3.getSelectedRow()) {
            DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
            Vector usuar = (Vector) modelo.getDataVector().get(jTable3.getSelectedRow());
            this.jtfIdUsuario.setText(usuar.get(0).toString());
            this.jtfUsuario.setText(usuar.get(1).toString());
            this.jtfSenha.setText(usuar.get(2).toString());
            this.jtfTipo.setText(usuar.get(3).toString());
        }
        this.row = jTable3.getSelectedRow();
    }//GEN-LAST:event_jTable3MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JLabel lbPesquisar;
    // End of variables declaration//GEN-END:variables
}