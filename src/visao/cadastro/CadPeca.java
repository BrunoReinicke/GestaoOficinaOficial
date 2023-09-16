/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastro;

import controle.FornecFactory;
import controle.PecaFactory;
import java.util.List;
import modelo.bean.Fornecedor;
import modelo.bean.Peca;
import visao.consulta.ConsFornecedor;
import visao.consulta.ConsPeca;

/**
 *
 * @author Bruno Reinicke
 */
public class CadPeca extends CadPadrao {

    private String qtde;
    private String preco;
    
    /**
     * Creates new form CadPeca
     */
    public CadPeca() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.jTFIdFornec.setVisible(false);
        super.bErro = false;
        this.qtde = "";
        this.preco = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFIdFornec = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFCategoria = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jFTFAno1 = new javax.swing.JFormattedTextField(super.getMascNum("####"));
        jTFNome1 = new javax.swing.JTextField();
        jBtnPesqFornec = new javax.swing.JButton();
        jTFPreco = new javax.swing.JTextField();
        jFTFQtde = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de peças");

        jTFIdFornec.setEditable(false);

        jLabel1.setText("Ano:");

        jLabel2.setText("Caregoria:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Preço R$:");

        jLabel6.setText("Quantidade:");

        jLabel7.setText("Fornecedor:");

        jTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarcaActionPerformed(evt);
            }
        });

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFNome1.setEditable(false);
        jTFNome1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTFNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNome1ActionPerformed(evt);
            }
        });

        jBtnPesqFornec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnPesqFornec.setText("...");
        jBtnPesqFornec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPesqFornecMouseClicked(evt);
            }
        });

        jTFPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPrecoKeyReleased(evt);
            }
        });

        jFTFQtde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFQtdeFocusLost(evt);
            }
        });
        jFTFQtde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTFQtdeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTFIdFornec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesqFornec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(jTFMarca, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jFTFAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFTFQtde, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTFIdFornec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFTFAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFTFQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesqFornec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMarcaActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNome1ActionPerformed

    private void jBtnPesqFornecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPesqFornecMouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            ConsFornecedor conForn = new ConsFornecedor();
            conForn.setVisible(true);
            conForn.setEhNome(true);
            conForn.listar("");
            conForn.setjTFNomFornec(this.jTFNome1);
            conForn.setjTFIdFornec(this.jTFIdFornec);
        });
    }//GEN-LAST:event_jBtnPesqFornecMouseClicked

    private void jFTFQtdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFQtdeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFQtdeFocusLost

    private void jFTFQtdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTFQtdeKeyReleased
        this.qtde = super.getApenasNros(this.qtde, evt, jFTFQtde);
        jFTFQtde.setText(this.qtde);
    }//GEN-LAST:event_jFTFQtdeKeyReleased

    private void jTFPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecoKeyReleased
        this.preco = super.getDecimais(this.preco, evt, jTFPreco);
        jTFPreco.setText(this.preco);
    }//GEN-LAST:event_jTFPrecoKeyReleased

    @Override
    public void salvar() {
        Peca pec = new Peca();
        if (!super.strTrim(this.jFTFAno1.getText()).equals(""))
            pec.setAno(Integer.valueOf(jFTFAno1.getText()));
        else
            pec.setAno(0);
        pec.setCategoria(jTFCategoria.getText());
        pec.setMarca(jTFMarca.getText());
        pec.setNome(jTFNome.getText());
        
        if (!super.strTrim(this.jTFPreco.getText()).equals("")) {
            String preco = jTFPreco.getText();
            if (preco.charAt(preco.length() - 1) == '.')
                preco = preco.substring(0, preco.length() - 1);
            pec.setPreco(Float.valueOf(jTFPreco.getText()));
        } else
            pec.setPreco(0);
            
        if (!super.strTrim(this.jFTFQtde.getText()).equals(""))
            pec.setQtde(Integer.valueOf(jFTFQtde.getText()));
        else
            pec.setQtde(0);
        
        Object objForn = new FornecFactory().consultar(Integer.valueOf(jTFIdFornec.getText()));
        pec.setForn((Fornecedor) ((List<Fornecedor>) objForn).get(0));

        if (!getJtfID().getText().equals(""))
            pec.setId(Integer.valueOf(getJtfID().getText()));
        if (!super.bErro)
            super.confirmar(new PecaFactory(), pec, "PecaPU");
        super.bErro = false;
    }

    @Override
    public void excluir() {
        new PecaFactory().excluir(Integer.valueOf(getJtfID().getText()));
    }

    @Override
    public void selecionar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsPeca consPec = new ConsPeca();
                consPec.setJTFIdPeca(getJtfID());
                consPec.setjTFNomPeca(jTFNome);
                consPec.setjTFCategoria(jTFCategoria);
                consPec.setjTFIdFornec(jTFIdFornec);
                consPec.setjTFMarca(jTFMarca);
                consPec.setjTFNomFornec(jTFNome1);
                consPec.setjTFPreco(jTFPreco);
                consPec.setjFTFAno(jFTFAno1);
                consPec.setjFTFQtde(jFTFQtde);
                consPec.listar("");
                consPec.setVisible(true);
                consPec.setCadastro(true);
            }
        });
    }

    @Override
    public void limpar() {
        getJtfID().setText("");
        this.jTFNome.setText("");
        this.jTFCategoria.setText("");
        this.jTFIdFornec.setText("");
        this.jTFMarca.setText("");
        this.jTFNome1.setText("");
        this.jTFPreco.setText("");
        this.jFTFAno1.setValue(null);
        this.jFTFQtde.setText("");
        this.qtde  = "";
        this.preco = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPesqFornec;
    private javax.swing.JFormattedTextField jFTFAno1;
    private javax.swing.JTextField jFTFQtde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTFCategoria;
    private javax.swing.JTextField jTFIdFornec;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNome1;
    private javax.swing.JTextField jTFPreco;
    // End of variables declaration//GEN-END:variables
}