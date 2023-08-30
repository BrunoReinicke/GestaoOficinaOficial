/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ClienteFactory;
import controle.OrdemServFactory;
import controle.UsuaFactory;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Cliente;
import modelo.bean.OrdemServico;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class ConsOrdemServico extends ConsPadrao {

    /**
     * Creates new form ConsOrdemServico
     */
    private List<Object> lstOS;
    private int idUsuario;
    
    public ConsOrdemServico() {
        initComponents();
        super.setSize();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de ordens de serviço");
        setPreferredSize(new java.awt.Dimension(500, 471));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened
    
    private void listarOrdensServ(DefaultTableModel modelo) {
        for (int i = 0; i < lstOS.size(); i++) {
            String dtEncerramento = "";
            if (((OrdemServico) lstOS.get(i)).getDtEncerramento() != null) {
                dtEncerramento = ((OrdemServico) lstOS.get(i)).getDtEncerramento().toString();
                dtEncerramento = super.formatarData(dtEncerramento);
            }
            String dtPrevisao = "";
            if (((OrdemServico) lstOS.get(i)).getPrazoEntrega() != null) { 
                dtPrevisao = ((OrdemServico) lstOS.get(i)).getPrazoEntrega().toString();
                dtPrevisao = super.formatarData(dtPrevisao);
            }
            String dtAbertura = "";
            if (((OrdemServico) lstOS.get(i)).getDtAbertura() != null) { 
                dtAbertura = ((OrdemServico) lstOS.get(i)).getDtAbertura().toString();
                dtAbertura = super.formatarData(dtAbertura);
            }

            if (((List<Usuario>) new UsuaFactory().consultar(this.idUsuario)).get(0).getTipo().equals("Comum"))   
                modelo.addRow(new String[]{
                     ((OrdemServico) lstOS.get(i)).getNumero().toString(), 
                     ((OrdemServico) lstOS.get(i)).getCliente().getNome(), 
                     ((OrdemServico) lstOS.get(i)).getCarro().getNome(),
                     ((OrdemServico) lstOS.get(i)).getPeca().getNome(),
                     dtAbertura,
                     dtEncerramento,
                     dtPrevisao,
                     ((OrdemServico) lstOS.get(i)).getTrocPeca(),
                     ((OrdemServico) lstOS.get(i)).getStatus()});
            else
                modelo.addRow(new String[]{
                     ((OrdemServico) lstOS.get(i)).getId().toString(), 
                     ((OrdemServico) lstOS.get(i)).getNumero().toString(), 
                     ((OrdemServico) lstOS.get(i)).getCliente().getNome(), 
                     ((OrdemServico) lstOS.get(i)).getCarro().getNome(),
                     ((OrdemServico) lstOS.get(i)).getPeca().getNome(),
                     dtAbertura,
                     dtEncerramento,
                     dtPrevisao,
                     ((OrdemServico) lstOS.get(i)).getTrocPeca(),
                     ((OrdemServico) lstOS.get(i)).getStatus()}); 
        }
        super.getTable().setModel(modelo);
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
   
    @Override
    public void listar(String info) {
        String numero = "";
        if (!info.equals(""))
            numero = " and numero = " + info;
            
        if (((List<Usuario>) new UsuaFactory().consultar(this.idUsuario)).get(0).getTipo().equals("Comum")) {
            String colunas[] = {"Número", "Cliente", "Carro", "Peça", "Dt. abertura", 
                                "Dt. encerramento", "Dt. previsão", "Troca de peça", "Status"};
            DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
            super.getBtnExcluir1().setVisible(false);
            List<Object> cli = (List<Object>) new ClienteFactory().consultar("from Cliente where idUsuario="+this.idUsuario);
            
            int idCliente = 0;
            if (!cli.isEmpty())
                idCliente = ((Cliente) cli.get(0)).getId();
          
            lstOS = (List<Object>) new OrdemServFactory().consultar(
                                "from OrdemServico where idCliente="+idCliente+" and status=0"+numero);
            if (!lstOS.isEmpty()) {
                this.listarOrdensServ(modelo);
                this.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Você não possui nenhuma OS em execução no momento.");
        } else {
            String colunas[] = {"ID", "Número", "Cliente", "Carro", "Peça", "Dt. abertura", 
                                "Dt. encerramento", "Dt. previsão", "Troca de peça", "Status"};
            DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
            
            lstOS = (List<Object>) new OrdemServFactory().consultar("from OrdemServico where 1=1 "+numero);
            this.listarOrdensServ(modelo);
            this.setVisible(true);
        } 
    }

    @Override
    public void excluir() {
        super.excluirPadrao(new OrdemServFactory());
    }

    @Override
    public void preencherCad(Vector vect) {
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}