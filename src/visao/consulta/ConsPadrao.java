/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.consulta;

import controle.Factory;
import java.awt.Button;
import java.util.Vector;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Reinicke
 */
public abstract class ConsPadrao extends javax.swing.JFrame {

    protected int row;
    protected boolean cadastro;
    protected boolean ehNome;
    protected JTextField jTFNome;
    
    /**
     * Creates new form ConsPadrao
     */
    public ConsPadrao() {
        initComponents();
        this.row = -1;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.cadastro = false;
        this.ehNome = false;
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }
    
    public abstract void listar(String info);
    public abstract void excluir();
    public abstract void preencherCad(Vector vect);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPesquisar = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        btnAtualizar = new java.awt.Button();
        btnExcluir1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbPadrao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1051, 523));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbPesquisar.setText("Pesquisar:");

        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });

        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir1.setLabel("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        jTbPadrao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTbPadrao.setPreferredSize(new java.awt.Dimension(1020, 500));
        jTbPadrao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbPadraoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTbPadraoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTbPadrao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPesquisar)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnExcluir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     //   this.listar("");
    }//GEN-LAST:event_formWindowOpened

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
        this.listar(jtfPesquisar.getText());
    }//GEN-LAST:event_jtfPesquisarKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        this.listar("");
        this.jtfPesquisar.setText("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        this.excluir();
        this.listar("");
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void jTbPadraoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPadraoMouseClicked
        this.row = this.jTbPadrao.getSelectedRow();
    }//GEN-LAST:event_jTbPadraoMouseClicked

    private void jTbPadraoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPadraoMouseReleased
        if ((this.row == this.jTbPadrao.getSelectedRow()) && (this.cadastro || this.ehNome)) {
            DefaultTableModel modelo = (DefaultTableModel) this.jTbPadrao.getModel();
            Vector vect = (Vector) modelo.getDataVector().get(this.jTbPadrao.getSelectedRow());
            this.preencherCad(vect);
            this.dispose();
        }
    }//GEN-LAST:event_jTbPadraoMouseReleased
    
    public String strTrim(String str) {
        String trim = "";
        for (int i = 0; i < str.length(); i++) 
            if (str.charAt(i) != ' ')
                trim = trim + str.charAt(i);
        return trim;
    }
    
    public void setTable(JTable jTbPadrao) {
        this.jTbPadrao = jTbPadrao;
    }
    
    public JTable getTable() {
        return this.jTbPadrao;
    }
    
    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }
    
    public void setEhNome(boolean ehNome) {
        this.ehNome = ehNome;
    }
    
    protected void excluirPadrao(Factory fact) {
        if (this.row > -1) {
            try {
                if (JOptionPane.showConfirmDialog(null, "Deseja confirmar a exclusão?") == 0) {
                    DefaultTableModel modelo = (DefaultTableModel) this.jTbPadrao.getModel();
                    Vector vect = (Vector) modelo.getDataVector().get(this.row);
                    fact.excluir(Integer.valueOf(vect.get(0).toString()));
                    this.row = -1;
                }
            } catch (RollbackException ex) {
                JOptionPane.showMessageDialog(null,
                             "Não é possível excluir, há algum item cadastrado que depende do item selecionado nesta tela.");
            }
        } else
            JOptionPane.showMessageDialog(null, "Não há nenhum item selecionado para exclusão.");
    }
    
    protected void setSize() {
        this.setSize(1151, 500);
        this.setResizable(false);
    }
    
    protected Button getBtnExcluir1() {
        return this.btnExcluir1;
    }
    
    protected String formatarData(String data) {
        return data.substring(8, 10) + '/' +
               data.substring(5, 7) + '/' +
               data.substring(0, 4);
    }
    
    public void setJTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAtualizar;
    private java.awt.Button btnExcluir1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbPadrao;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JLabel lbPesquisar;
    // End of variables declaration//GEN-END:variables
}