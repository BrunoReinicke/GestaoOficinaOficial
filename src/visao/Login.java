/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.UsuaFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class Login extends JFrame {

    private JButton btnCadUsu;
    private JButton btnConsUsu;
    private JButton btnConsOS;
    private JButton btnCadOS;
    private JButton btnLogin;
    private JButton btnConsAdm;
    private JButton btnConsCar;
    private JButton btnConsClie;
    private JButton btnConsForn;
    private int idUsuario;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Usuário:");
        jLabel1.setToolTipText("");
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("Senha:");
        jLabel2.setToolTipText("");
        jLabel2.setName(""); // NOI18N

        jButton1.setText("Logar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Usuario u = new Usuario();
        u.setUsuario(jTextField1.getText());
        u.setSenha(new String(jPasswordField2.getPassword()));
       
        if (!new UsuaFactory().isLogged(u).isEmpty()) {
            this.idUsuario = ((Usuario) new UsuaFactory().isLogged(u).get(0)).getId();           
            if (((Usuario) new UsuaFactory().isLogged(u).get(0)).getTipo().equalsIgnoreCase("Administrador")) {
                this.btnCadUsu.setVisible(true);
                this.btnConsUsu.setVisible(true);
                this.btnCadOS.setVisible(true);
                this.btnConsAdm.setVisible(true);
                this.btnConsCar.setVisible(true);
                this.btnConsClie.setVisible(true);
                this.btnConsForn.setVisible(true);
            }
            this.btnConsOS.setVisible(true);
            this.btnLogin.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */

    public void setBtnCadUsu(JButton btnCadUsu) {
        this.btnCadUsu = btnCadUsu;
    }

    public void setBtnConsUsu(JButton btnConsUsu) {
        this.btnConsUsu = btnConsUsu;
    }

    /**
     * @param args the command line arguments
     */
    public void setBtnConsOS(JButton btnConsOS) {
        this.btnConsOS = btnConsOS;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public JButton getBtnCadOS() {
        return btnCadOS;
    }

    public void setBtnCadOS(JButton btnCadOS) {
        this.btnCadOS = btnCadOS;
    }
    
    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JButton getBtnConsAdm() {
        return btnConsAdm;
    }

    public void setBtnConsAdm(JButton btnConsAdm) {
        this.btnConsAdm = btnConsAdm;
    }
    
    public JButton getBtnConsCar() {
        return btnConsCar;
    }

    public void setBtnConsCar(JButton btnConsCar) {
        this.btnConsCar = btnConsCar;
    }
    
    public JButton getBtnConsClie() {
        return btnConsClie;
    }

    public void setBtnConsClie(JButton btnConsClie) {
        this.btnConsClie = btnConsClie;
    }

    public JButton getBtnConsForn() {
        return btnConsForn;
    }

    public void setBtnConsForn(JButton btnConsForn) {
        this.btnConsForn = btnConsForn;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}