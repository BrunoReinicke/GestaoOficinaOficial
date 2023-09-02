/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import visao.consulta.ConsUsuario;
import visao.consulta.ConsPeca;
import visao.consulta.ConsPadrao;
import visao.consulta.ConsOrdemServico;
import visao.consulta.ConsFornecedor;
import visao.consulta.ConsCliente;
import visao.consulta.ConsCarro;
import visao.consulta.ConsAdministrador;
import visao.cadastro.CadtUsuario;
import visao.cadastro.CadPadrao;
import visao.cadastro.CadOrdemServico;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author bruno
 */
public class Principal extends javax.swing.JFrame {

    //private int idUsuario;
    private Login log;
    private CadtUsuario caUs;
    private ConsUsuario conUs;
    private ConsOrdemServico conOS;
    private CadOrdemServico cadOS;
    private ConsAdministrador conAdm;
    private ConsCarro conCar;
    private ConsCliente conClie;
    private ConsFornecedor conForn;
    private ConsPeca conPeca;
    protected Object obj;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        this.jButton1.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(false);
        this.jButton6.setVisible(false);
        this.jBtnConsAdm.setVisible(false);
        this.jBtnConsCarros.setVisible(false);
        this.jBtnConsCli.setVisible(false);
        this.jBtnConsForn.setVisible(false);
        this.jBtnConsPeca.setVisible(false);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jBtnConsAdm = new javax.swing.JButton();
        jBtnConsCarros = new javax.swing.JButton();
        jBtnConsCli = new javax.swing.JButton();
        jBtnConsForn = new javax.swing.JButton();
        jBtnConsPeca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OSTPA");

        jButton1.setLabel("Cadastrar usuário");
        jButton1.setName("btnCadastrar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar OS");
        jButton2.setName("btnConsultar"); // NOI18N
        jButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton2ComponentShown(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Consultar usuários");
        jButton3.setName("btnConsultar"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Login");
        jButton4.setName(""); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cadastrar OS");
        jButton6.setActionCommand("");
        jButton6.setName("btnConsultar"); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jBtnConsAdm.setText("Consultar adm.");
        jBtnConsAdm.setName("btnConsultar"); // NOI18N
        jBtnConsAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnConsAdmMouseClicked(evt);
            }
        });
        jBtnConsAdm.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jBtnConsAdmComponentShown(evt);
            }
        });
        jBtnConsAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsAdmActionPerformed(evt);
            }
        });

        jBtnConsCarros.setText("Consultar carros");
        jBtnConsCarros.setName("btnConsultar"); // NOI18N
        jBtnConsCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnConsCarrosMouseClicked(evt);
            }
        });
        jBtnConsCarros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jBtnConsCarrosComponentShown(evt);
            }
        });
        jBtnConsCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsCarrosActionPerformed(evt);
            }
        });

        jBtnConsCli.setText("Consultar clientes");
        jBtnConsCli.setName("btnConsultar"); // NOI18N
        jBtnConsCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnConsCliMouseClicked(evt);
            }
        });
        jBtnConsCli.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jBtnConsCliComponentShown(evt);
            }
        });
        jBtnConsCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsCliActionPerformed(evt);
            }
        });

        jBtnConsForn.setText("Cons. fornecedores");
        jBtnConsForn.setName("btnConsultar"); // NOI18N
        jBtnConsForn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnConsFornMouseClicked(evt);
            }
        });
        jBtnConsForn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jBtnConsFornComponentShown(evt);
            }
        });
        jBtnConsForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsFornActionPerformed(evt);
            }
        });

        jBtnConsPeca.setText("Consultar peças");
        jBtnConsPeca.setName("btnConsultar"); // NOI18N
        jBtnConsPeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnConsPecaMouseClicked(evt);
            }
        });
        jBtnConsPeca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jBtnConsPecaComponentShown(evt);
            }
        });
        jBtnConsPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsPecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConsAdm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConsCarros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConsCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConsForn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConsPeca)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton2)
                    .addComponent(jBtnConsAdm)
                    .addComponent(jBtnConsCarros)
                    .addComponent(jBtnConsCli)
                    .addComponent(jBtnConsForn)
                    .addComponent(jBtnConsPeca))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.caUs = new CadtUsuario();
        this.caUs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.conOS = new ConsOrdemServico();
        this.conOS.setIdUsuario(this.log.getIdUsuario());
        this.conOS.listar("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.conUs = new ConsUsuario();
        this.conUs.listar("");
        this.conUs.setVisible(true);
        this.conUs.addKeyListener((KeyListener) this);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.log = new Login();
        this.log.setBtnCadUsu(this.jButton1);
        this.log.setBtnConsUsu(this.jButton3);
        this.log.setBtnConsOS(this.jButton2);
        this.log.setBtnCadOS(this.jButton6);
        this.log.setBtnLogin(this.jButton4);
        this.log.setBtnConsAdm(this.jBtnConsAdm);
        this.log.setBtnConsCar(this.jBtnConsCarros);
        this.log.setBtnConsClie(this.jBtnConsCli);
        this.log.setBtnConsForn(this.jBtnConsForn);
        this.log.setBtnConsPeca(this.jBtnConsPeca);
        this.log.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void fecharTelaCons(ConsPadrao cons) {
        if (cons != null)
            cons.dispose();
    }
    
    private void fecharTelaCad(CadPadrao cad) {
        if (cad != null)
            cad.dispose();
    }
    
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        this.jButton1.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(false);
        this.jButton6.setVisible(false);
        this.jBtnConsAdm.setVisible(false);
        this.jBtnConsCarros.setVisible(false);
        this.jBtnConsCli.setVisible(false);
        this.jBtnConsForn.setVisible(false);
        this.jBtnConsPeca.setVisible(false);
        this.jButton4.setVisible(true);
        
        this.fecharTelaCons(this.conUs);
        this.fecharTelaCad(this.caUs);
        
        this.fecharTelaCons(this.conOS);
        this.fecharTelaCad(this.cadOS);
     
        this.fecharTelaCons(this.conAdm);
        
        this.fecharTelaCons(this.conCar);
        
        this.fecharTelaCons(this.conClie);

        this.fecharTelaCons(this.conForn);
        
        this.fecharTelaCons(this.conPeca);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentShown
        this.log.dispose();
    }//GEN-LAST:event_jButton2ComponentShown

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        this.cadOS = new CadOrdemServico();
        this.cadOS.setVisible(true);
        this.cadOS.setIdUsuario(this.log.getIdUsuario());
    }//GEN-LAST:event_jButton6MouseClicked
    
    private void jBtnConsAdmComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBtnConsAdmComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsAdmComponentShown

    private void jBtnConsAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsAdmActionPerformed

    private void jBtnConsAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnConsAdmMouseClicked
        this.conAdm = new ConsAdministrador();
        this.conAdm.listar("");
        this.conAdm.setVisible(true);
    }//GEN-LAST:event_jBtnConsAdmMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBtnConsCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnConsCarrosMouseClicked
        this.conCar = new ConsCarro();
        this.conCar.listar("");
        this.conCar.setVisible(true);
    }//GEN-LAST:event_jBtnConsCarrosMouseClicked

    private void jBtnConsCarrosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBtnConsCarrosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsCarrosComponentShown

    private void jBtnConsCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsCarrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsCarrosActionPerformed

    private void jBtnConsCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnConsCliMouseClicked
        this.conClie = new ConsCliente();
        this.conClie.listar("");
        this.conClie.setVisible(true);
    }//GEN-LAST:event_jBtnConsCliMouseClicked

    private void jBtnConsCliComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBtnConsCliComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsCliComponentShown

    private void jBtnConsCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsCliActionPerformed

    private void jBtnConsFornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnConsFornMouseClicked
        this.conForn = new ConsFornecedor();
        this.conForn.listar("");
        this.conForn.setVisible(true);
    }//GEN-LAST:event_jBtnConsFornMouseClicked

    private void jBtnConsFornComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBtnConsFornComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsFornComponentShown

    private void jBtnConsFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsFornActionPerformed
       
    }//GEN-LAST:event_jBtnConsFornActionPerformed

    private void jBtnConsPecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnConsPecaMouseClicked
        this.conPeca = new ConsPeca();
        this.conPeca.listar("");
        this.conPeca.setVisible(true);
    }//GEN-LAST:event_jBtnConsPecaMouseClicked

    private void jBtnConsPecaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBtnConsPecaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsPecaComponentShown

    private void jBtnConsPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsPecaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConsAdm;
    private javax.swing.JButton jBtnConsCarros;
    private javax.swing.JButton jBtnConsCli;
    private javax.swing.JButton jBtnConsForn;
    private javax.swing.JButton jBtnConsPeca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton4() {
        return this.jButton4;
    }
}