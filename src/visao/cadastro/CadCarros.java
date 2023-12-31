/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastro;

import controle.CarroFactory;
import controle.ClienteFactory;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import visao.consulta.ConsCarro;
import visao.consulta.ConsCliente;

/**
 *
 * @author Bruno Reinicke
 */
public class CadCarros extends CadPadrao {

    private String ano;
    
    /**
     * Creates new form CadCarros
     */
    public CadCarros() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.jTFIdCliente.setVisible(false);
        this.ano = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFPlaca = new javax.swing.JTextField();
        jTFUF = new javax.swing.JTextField();
        jTFCliente = new javax.swing.JTextField();
        jBtnPesqCliente = new javax.swing.JButton();
        jTFAno = new javax.swing.JFormattedTextField(super.getMascNum("####"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de carros");

        jTFIdCliente.setEditable(false);

        jLabel1.setText("Ano:");

        jLabel2.setText("Cidade:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Nome:");

        jLabel5.setText("País:");

        jLabel6.setText("Placa:");

        jLabel7.setText("UF:");

        jLabel8.setText("Cliente:");

        jTFCliente.setEditable(false);
        jTFCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jBtnPesqCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnPesqCliente.setText("...");
        jBtnPesqCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPesqClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel3))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(jTFMarca)
                                        .addComponent(jTFNome)
                                        .addComponent(jTFPais)
                                        .addComponent(jTFPlaca)
                                        .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesqCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesqClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPesqClienteMouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            ConsCliente conClie = new ConsCliente();
            conClie.setVisible(true);
            conClie.setEhNome(true);
            conClie.listar("");
            conClie.setJTFNome(this.jTFCliente);
            conClie.setJTFIdCliente(this.jTFIdCliente);
            addLstCons(conClie);
        });
    }//GEN-LAST:event_jBtnPesqClienteMouseClicked

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
            java.util.logging.Logger.getLogger(CadCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCarros().setVisible(true);
            }
        });
    }

    @Override
    public void salvar() {
        if (!this.jTFCliente.getText().equals("")) {
            Carro car = new Carro();
            if (!super.strTrim(this.jTFAno.getText()).equals(""))
                car.setAno(Integer.valueOf(this.jTFAno.getText()));
            else
                car.setAno(0);
            car.setCidade(this.jTFCidade.getText());
            car.setMarca(this.jTFMarca.getText());
            car.setNome(this.jTFNome.getText());
            car.setPais(this.jTFPais.getText());
            car.setPlaca(this.jTFPlaca.getText());
            car.setUf(this.jTFUF.getText());

            Object objCli = new ClienteFactory().consultar(Integer.valueOf(jTFIdCliente.getText()));
            car.setDono((Cliente) ((List<Cliente>) objCli).get(0));

            if (!getJtfID().getText().equals(""))
                car.setId(Integer.valueOf(getJtfID().getText()));
            if (!super.bErro)
                super.confirmar(new CarroFactory(), car, "CarroPU");
            super.bErro = false;
        } else
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar: campo cliente é obrigatório e não está preenchido.");
    }

    @Override
    public void excluir() {
        new CarroFactory().excluir(Integer.valueOf(getJtfID().getText()));
    }

    @Override
    public void selecionar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsCarro consCar = new ConsCarro();
                consCar.setJTFIdCarro(getJtfID());
                consCar.setjTFNomeCar(jTFNome);
                consCar.setjTFAno(jTFAno);
                consCar.setjTFCidade(jTFCidade);
                consCar.setjTFCliente(jTFCliente);
                consCar.setjTFIdCliente(jTFIdCliente);
                consCar.setjTFMarca(jTFMarca);
                consCar.setjTFPais(jTFPais);
                consCar.setjTFPlaca(jTFPlaca);
                consCar.setjTFUF(jTFUF);
                consCar.setCadastro(true);
                consCar.setVisible(true);
                consCar.listar("");
                addLstCons(consCar);
            }
        });
    }

    @Override
    public void limpar() {
        getJtfID().setText("");
        this.jTFAno.setText("");
        this.jTFCidade.setText("");
        this.jTFMarca.setText("");
        this.jTFNome.setText("");
        this.jTFPais.setText("");
        this.jTFPlaca.setText("");
        this.jTFUF.setText("");
        this.jTFCliente.setText("");
        this.ano = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPesqCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField jTFAno;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCliente;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFUF;
    // End of variables declaration//GEN-END:variables
}