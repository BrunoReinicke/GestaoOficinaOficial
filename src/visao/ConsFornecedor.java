/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controle.FornecFactory;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Fornecedor;

/**
 *
 * @author Bruno Reinicke
 */
public class ConsFornecedor extends ConsPadrao {

    /**
     * Creates new form ConsFornecedor
     */
    public ConsFornecedor() {
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
        setTitle("Consulta de fornecedores");

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
            java.util.logging.Logger.getLogger(ConsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsFornecedor().setVisible(true);
            }
        });
    }

    @Override
    public void listar(String info) {
        List<Fornecedor> list;
        if (info.equals(""))
           list = (List<Fornecedor>) new FornecFactory().consultar("");
        else
           list = (List<Fornecedor>) new FornecFactory().consultar(" where nome like '"+info+"%'");      
        String colunas[]   = {"ID", "Cidade", "CPF", "Dt. nascimento", "Idade", 
                              "Nome", "País", "RG", "Sexo", "UF"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for (int i = 0; i < list.size(); i++) {
            modelo.addRow(new String[]{
                list.get(i).getId().toString(), 
                String.valueOf(list.get(i).getCidade()), 
                list.get(i).getCpf(),
                super.formatarData(list.get(i).getDataNasc().toString()),
                String.valueOf(list.get(i).getIdade()),
                list.get(i).getNome(),
                list.get(i).getPais(),
                list.get(i).getRg(),
                list.get(i).getSexo(),
                list.get(i).getUf()
            });
        }
        super.getTable().setModel(modelo);
    }

    @Override
    public void excluir() {
        super.excluirPadrao(new FornecFactory());
    }

    @Override
    public void preencherCad(Vector vect) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}