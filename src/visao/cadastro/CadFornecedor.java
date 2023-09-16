/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastro;

import controle.CarroFactory;
import controle.ClienteFactory;
import controle.FornecFactory;
import controle.UsuaFactory;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import modelo.bean.Fornecedor;
import modelo.bean.Usuario;
import visao.consulta.ConsCliente;
import visao.consulta.ConsFornecedor;
import visao.consulta.ConsUsuario;

/**
 *
 * @author Bruno Reinicke
 */
public class CadFornecedor extends CadPadrao {

    private String idade;
    private JTextField jTFIdFornec;
    private List<Cliente> list;
    
    /**
     * Creates new form CadClientes
     */
    public CadFornecedor() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.idade = "";
        super.bErro = false;
        this.jTFIdade.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jFTFCpf = new javax.swing.JFormattedTextField(super.getMascCPF());
        jFTFDtNasc = new javax.swing.JFormattedTextField(super.getMascData());
        jTFIdade = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFFRg = new javax.swing.JFormattedTextField(super.getMascRG());
        jTFSexo = new javax.swing.JTextField();
        jTFUf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de fornecedores");
        setAlwaysOnTop(true);

        jLabel1.setText("Cidade:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data de nascimento:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Nome:");

        jLabel6.setText("País:");

        jLabel7.setText("RG:");

        jLabel8.setText("Sexo:");

        jLabel9.setText("UF:");

        jFTFDtNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFDtNascFocusLost(evt);
            }
        });

        jTFIdade.setEditable(false);
        jTFIdade.setToolTipText("");
        jTFIdade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIdadeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jFTFDtNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(jTFFRg)
                        .addComponent(jTFSexo)
                        .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFPais, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(jFTFCpf)
                        .addComponent(jTFCidade))
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdadeKeyReleased
        this.idade = super.getApenasNros(this.idade, evt, jTFIdade);
        jTFIdade.setText(this.idade);
    }//GEN-LAST:event_jTFIdadeKeyReleased

    private void jFTFDtNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFDtNascFocusLost
        int idade = super.getAnosEntDt(jFTFDtNasc.getText());
        this.jTFIdade.setText(String.valueOf(idade));
    }//GEN-LAST:event_jFTFDtNascFocusLost

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
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFornecedor().setVisible(true);
            }
        });
    }

    @Override
    public void salvar() {
        Fornecedor forn = new Fornecedor();
        forn.setCidade(this.jTFCidade.getText());
        forn.setCpf(this.jFTFCpf.getText());
        forn.setDataNasc(this.validarData("nascimento", this.jFTFDtNasc.getText(), ""));
        if (!super.strTrim(this.jTFIdade.getText()).equals(""))
            forn.setIdade(Integer.valueOf(this.jTFIdade.getText()).intValue());
        else
            forn.setIdade(0);
        forn.setNome(this.jTFNome.getText());
        forn.setPais(this.jTFPais.getText());
        forn.setRg(this.jTFFRg.getText());
        forn.setSexo(this.jTFSexo.getText());
        forn.setUf(this.jTFUf.getText());
        if (!getJtfID().getText().equals(""))
            forn.setId(Integer.valueOf(getJtfID().getText()));
        
        if (!super.bErro)
            super.confirmar(new FornecFactory(), forn, "FornecedorPU");
        super.bErro = false;
    }

    @Override
    public void excluir() {
        new FornecFactory().excluir(Integer.valueOf(getJtfID().getText()));
    }

    @Override
    public void selecionar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsFornecedor conFornec = new ConsFornecedor();
                conFornec.setVisible(true);
                conFornec.setCadastro(true);
                conFornec.setJTFNome(jTFNome);
                conFornec.setjTFCidade(jTFCidade);
                conFornec.setjFTFCpf(jFTFCpf);
                conFornec.setjFTFDtNascimento(jFTFDtNasc);
                conFornec.setjTFIdade(jTFIdade);
                conFornec.setjTFPais(jTFPais);
                conFornec.setjFTFRg(jTFFRg);
                conFornec.setjTFUf(jTFUf);
                conFornec.setjTFNomFornec(jTFNome);
                conFornec.setjTFSexo(jTFSexo);
                conFornec.setjTFIdFornec(getJtfID());
                conFornec.listar("");
            }
        });
    }

    @Override
    public void limpar() {
        getJtfID().setText("");
        this.jTFCidade.setText("");
        this.jFTFCpf.setValue(null);
        this.jFTFDtNasc.setValue(null);
        this.jTFIdade.setText("");
        this.jTFNome.setText("");
        this.jTFPais.setText("");
        this.jTFFRg.setValue(null);
        this.jTFSexo.setText("");
        this.jTFUf.setText("");
        this.idade = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JFormattedTextField jTFFRg;
    private javax.swing.JTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFSexo;
    private javax.swing.JTextField jTFUf;
    // End of variables declaration//GEN-END:variables
}