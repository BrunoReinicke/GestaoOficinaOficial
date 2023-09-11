/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.consulta;

import visao.consulta.ConsPadrao;
import controle.UsuaFactory;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class ConsUsuario extends ConsPadrao {

    /**
     * Creates new form ConsUsuario
     */
    private JTextField jtfUsuario;
    private JPasswordField jtfSenha;
    private JComboBox jcbTipo;
    private JTextField jtfIdUsuario;
    private boolean comum;
    private boolean admin;
    
    public ConsUsuario() {
        initComponents();
        super.setSize();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.comum = false;
        this.admin = false;
    }

    public void setJtfUsuario(JTextField jtfUsuario) {
        this.jtfUsuario = jtfUsuario;
    }
    
    public void setJtfIdfUsuario(JTextField jtfIdUsuario) {
        this.jtfIdUsuario = jtfIdUsuario;
    }

    public void setComum(boolean comum) {
        this.comum = comum;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public void setJtfSenha(JPasswordField jtfSenha) {
        this.jtfSenha = jtfSenha;
    }
    
    public void setJcbTipo(JComboBox jcbTipo) {
        this.jcbTipo = jcbTipo;
    }
    
    @Override
    public void listar(String info) {
        List<Usuario> list;
        String sql = "";
        if (this.admin) 
            sql = " and (tipo = 'Administrador') ";
        if (this.comum) 
            sql = " and (tipo = 'Comum') ";
        
        if (info.equals(""))
           list = (List<Usuario>) new UsuaFactory().consultar(" where 1=1 "+sql);
        else
           list = (List<Usuario>) new UsuaFactory().consultar(" where usuario like '"+info+"%' "+sql);      
        String colunas[]   = {"ID", "Usuário", "Senha", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < list.size(); i++) {
            modelo.addRow(new String[]{
                list.get(i).getId().toString(), 
                list.get(i).getUsuario(), 
                list.get(i).getSenha(),
                list.get(i).getTipo()});
        }
        super.getTable().setModel(modelo);
    }

    @Override
    public void excluir() {
        super.excluirPadrao(new UsuaFactory());
    }
    
    @Override
    public void preencherCad(Vector vect) {
        if (super.ehNome) {
            super.jTFNome.setText(vect.get(1).toString());
            this.jtfIdUsuario.setText(vect.get(0).toString());
        } else {
            this.jtfIdUsuario.setText(vect.get(0).toString());
            this.jtfUsuario.setText(vect.get(1).toString());
            this.jtfSenha.setText(vect.get(2).toString());
            if (vect.get(3).toString().equalsIgnoreCase("Administrador")) 
                this.jcbTipo.setSelectedIndex(0);
            else
                this.jcbTipo.setSelectedIndex(1);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     //   this.preencherTela("");
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}