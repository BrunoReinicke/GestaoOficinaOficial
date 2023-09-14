/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastro;

import controle.ClienteFactory;
import controle.UsuaFactory;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.bean.Cliente;
import modelo.bean.Usuario;
import visao.consulta.ConsCliente;
import visao.consulta.ConsUsuario;

/**
 *
 * @author Bruno Reinicke
 */
public class CadClientes extends CadPadrao {

    private String idade;
    
    /**
     * Creates new form CadClientes
     */
    public CadClientes() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.jTFIdUsuario.setVisible(false);
        this.idade = "";
        super.bErro = false;
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
        jLabel10 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jFTFCpf = new javax.swing.JFormattedTextField(super.getMascCPF());
        jFTFDtNasc = new javax.swing.JFormattedTextField(super.getMascData());
        jTFIdade = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFFRg = new javax.swing.JFormattedTextField(super.getMascRG());
        jTFSexo = new javax.swing.JTextField();
        jTFUf = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jTFIdUsuario = new javax.swing.JTextField();
        jBtnPesqUsuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de clientes");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cidade:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data de nascimento:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Nome:");

        jLabel6.setText("País:");

        jLabel7.setText("RG:");

        jLabel8.setText("Sexo:");

        jLabel9.setText("UF:");

        jLabel10.setText("Usuário:");

        jTFIdade.setToolTipText("");
        jTFIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIdadeKeyReleased(evt);
            }
        });

        jTFUsuario.setEditable(false);
        jTFUsuario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jTFIdUsuario.setToolTipText("");

        jBtnPesqUsuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnPesqUsuar.setText("...");
        jBtnPesqUsuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPesqUsuarMouseClicked(evt);
            }
        });
        jBtnPesqUsuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesqUsuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(layout.createSequentialGroup()
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesqUsuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTFIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jBtnPesqUsuar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesqUsuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPesqUsuarMouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            ConsUsuario conUsua = new ConsUsuario();
            conUsua.setVisible(true);
            conUsua.setEhNome(true);
            conUsua.setComum(true);
            conUsua.listar("");
            conUsua.setJTFNome(this.jTFUsuario);
            conUsua.setJtfIdfUsuario(this.jTFIdUsuario);
        });
    }//GEN-LAST:event_jBtnPesqUsuarMouseClicked

    private void jBtnPesqUsuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesqUsuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnPesqUsuarActionPerformed

    private void jTFIdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdadeKeyReleased
        this.idade = super.getApenasNros(this.idade, evt, jTFIdade);
        jTFIdade.setText(this.idade);
    }//GEN-LAST:event_jTFIdadeKeyReleased

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
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadClientes().setVisible(true);
            }
        });
    }

    @Override
    public void salvar() {
        if (!this.jTFUsuario.getText().equals("")) {
            Object objCli = new ClienteFactory().consultar(" where idUsuario = " + Integer.valueOf(jTFIdUsuario.getText()));
            
            if (((List<Cliente>) objCli).isEmpty() || (!getJtfID().getText().equals(""))) {
                Cliente cli = new Cliente();
                cli.setCidade(this.jTFCidade.getText());
                cli.setCpf(this.jFTFCpf.getText());
                cli.setDataNasc(this.validarData("nascimento", this.jFTFDtNasc.getText(), ""));
                if (!super.strTrim(this.jTFIdade.getText()).equals(""))
                    cli.setIdade(Integer.valueOf(this.jTFIdade.getText()).intValue());
                else
                    cli.setIdade(0);
                cli.setNome(this.jTFNome.getText());
                cli.setPais(this.jTFPais.getText());
                cli.setRg(this.jTFFRg.getText());
                cli.setSexo(this.jTFSexo.getText());
                cli.setUf(this.jTFUf.getText());

                Object objUsu = new UsuaFactory().consultar(Integer.valueOf(jTFIdUsuario.getText()));
                cli.setUsu((Usuario) ((List<Usuario>) objUsu).get(0));
                
                if (!getJtfID().getText().equals(""))
                    cli.setId(Integer.valueOf(getJtfID().getText()));
                if (!super.bErro)
                    super.confirmar(new ClienteFactory(), cli, "ClientePU");
                super.bErro = false;
            } else
                JOptionPane.showMessageDialog(this, "Não é possível cadastrar: cliente já cadastrado para o usuário selecionado.");
        } else
            JOptionPane.showMessageDialog(this, "Não é possível cadastrar: campo usuário é obrigatório e não está preenchido.");
    }

    @Override
    public void excluir() {
        new ClienteFactory().excluir(Integer.valueOf(getJtfID().getText()));
    }

    @Override
    public void selecionar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsCliente conCli = new ConsCliente();
                conCli.setVisible(true);
                conCli.setCadastro(true);
                conCli.setjTFIdCliente(getJtfID());
                conCli.setJTFNome(jTFNome);
                conCli.setjTFCidade(jTFCidade);
                conCli.setjFTFCpf(jFTFCpf);
                conCli.setjFTFDtNascimento(jFTFDtNasc);
                conCli.setjTFIdUsuario(jTFIdUsuario);
                conCli.setjTFIdade(jTFIdade);
                conCli.setjTFPais(jTFPais);
                conCli.setjFTFRg(jTFFRg);
                conCli.setjTFUf(jTFUf);
                conCli.setjTFUsuario(jTFUsuario);
                conCli.setjTFNome(jTFNome);
                conCli.setjTFSexo(jTFSexo);
                conCli.listar("");
            }
        });
    }

    @Override
    public void limpar() {
        getJtfID().setText("");
        this.jTFCidade.setText("");
        this.jFTFCpf.setValue(null);
        this.jFTFDtNasc.setValue(null);
        this.jTFIdUsuario.setText("");
        this.jTFIdade.setText("");
        this.jTFNome.setText("");
        this.jTFPais.setText("");
        this.jTFFRg.setValue(null);
        this.jTFSexo.setText("");
        this.jTFUf.setText("");
        this.jTFUsuario.setText("");
        this.idade = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPesqUsuar;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTFIdUsuario;
    private javax.swing.JTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFSexo;
    private javax.swing.JTextField jTFUf;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}