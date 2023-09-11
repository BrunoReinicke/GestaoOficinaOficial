/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.consulta;

import controle.AdminFactory;
import java.util.List;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Administrador;
import modelo.bean.Usuario;

/**
 *
 * @author Bruno Reinicke
 */
public class ConsAdministrador extends ConsPadrao {

    private JTextField jTFIdUsuario;
    private JTextField jTFIdAdmin;
    private JTextField jTFCidade;
    private JFormattedTextField jFTFCpf;
    private JFormattedTextField jFTFDtNascimento;
    private JTextField jTFIdade;
    private JTextField jTFNome;
    private JTextField jTFPais;
    private JFormattedTextField jFTFRg;
    private JTextField jTFSexo;
    private JTextField jTFUf;
    private JTextField jTFUsuario;
    private List<Administrador> lstAdm;
    
    /**
     * Creates new form ConsAdministrador
     */
    public ConsAdministrador() {
        initComponents();
        super.setSize();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de administradores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsAdministrador().setVisible(true);
            }
        });
    }

    @Override
    public void listar(String info) {
        if (info.equals(""))
           this.lstAdm = (List<Administrador>) new AdminFactory().consultar("");
        else
           this.lstAdm = (List<Administrador>) new AdminFactory().consultar(" where nome like '"+info+"%'");      
        String colunas[]   = {"ID", "Cidade", "CPF", "Dt. nascimento", 
                            "Idade", "Nome", "País", "RG",
                            "Sexo", "UF", "Usuário"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < this.lstAdm.size(); i++) {
            modelo.addRow(new String[]{
                this.lstAdm.get(i).getId().toString(), 
                this.lstAdm.get(i).getCidade(), 
                this.lstAdm.get(i).getCpf(),
                super.formatarData(this.lstAdm.get(i).getDataNasc().toString()),
                String.valueOf(this.lstAdm.get(i).getIdade()),
                this.lstAdm.get(i).getNome(),
                this.lstAdm.get(i).getPais(),
                this.lstAdm.get(i).getRg(),
                this.lstAdm.get(i).getSexo(),
                this.lstAdm.get(i).getUf(),
                this.lstAdm.get(i).getUsu().getUsuario()
            });
        }
        super.getTable().setModel(modelo);
    }

    public void setjTFIdUsuario(JTextField jTFIdUsuario) {
        this.jTFIdUsuario = jTFIdUsuario;
    }

    public void setjTFIdAdmin(JTextField jTFIdAdmin) {
        this.jTFIdAdmin = jTFIdAdmin;
    }

    public void setjTFCidade(JTextField jTFCidade) {
        this.jTFCidade = jTFCidade;
    }

    public void setjFTFCpf(JFormattedTextField jFTFCpf) {
        this.jFTFCpf = jFTFCpf;
    }

    public void setjFTFDtNascimento(JFormattedTextField jFTFDtNascimento) {
        this.jFTFDtNascimento = jFTFDtNascimento;
    }

    public void setjTFIdade(JTextField jTFIdade) {
        this.jTFIdade = jTFIdade;
    }

    public void setjTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }

    public void setjTFPais(JTextField jTFPais) {
        this.jTFPais = jTFPais;
    }

    public void setjFTFRg(JFormattedTextField jFTFRg) {
        this.jFTFRg = jFTFRg;
    }

    public void setjTFSexo(JTextField jTFSexo) {
        this.jTFSexo = jTFSexo;
    }

    public void setjTFUf(JTextField jTFUf) {
        this.jTFUf = jTFUf;
    }

    public void setjTFUsuario(JTextField jTFUsuario) {
        this.jTFUsuario = jTFUsuario;
    }
    
    @Override
    public void excluir() {
        super.excluirPadrao(new AdminFactory());
    }

    @Override
    public void preencherCad(Vector vect) {
        this.jTFCidade.setText(vect.get(1).toString());
        
        if (!vect.get(2).toString().equals(""))
            this.jFTFCpf.setValue(vect.get(2).toString());
        else
            this.jFTFCpf.setValue(null);
        
        if (!vect.get(3).toString().equals(""))
            this.jFTFDtNascimento.setValue(vect.get(3).toString());
        else
            this.jFTFDtNascimento.setValue(null);
    
        this.jTFIdade.setText(vect.get(4).toString());
        this.jTFNome.setText(vect.get(5).toString());
        this.jTFPais.setText(vect.get(6).toString());
        
        if (!vect.get(7).toString().equals(""))
            this.jFTFRg.setValue(vect.get(7).toString());
        else
            this.jFTFRg.setValue(null);
        
        this.jTFSexo.setText(vect.get(8).toString());
        this.jTFUf.setText(vect.get(9).toString());
        this.jTFUsuario.setText(vect.get(10).toString());
        
        int idUsuario = ((Administrador) this.lstAdm.get(super.row)).getUsu().getId();
        this.jTFIdUsuario.setText(idUsuario + "");
        this.jTFIdAdmin.setText(vect.get(0).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}