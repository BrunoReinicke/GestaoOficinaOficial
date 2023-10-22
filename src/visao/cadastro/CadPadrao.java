/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastro;

import controle.Factory;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;
import visao.consulta.ConsPadrao;

/**
 *
 * @author Bruno Reinicke
 */
public abstract class CadPadrao extends javax.swing.JFrame {

    /**
     * Creates new form CadPadrao
     */
    private int idUsuario;
    protected boolean bErro;
    private final List<ConsPadrao> lstCons;

    public abstract void salvar();
    public abstract void excluir();
    public abstract void selecionar();
    public abstract void limpar();
    
    public CadPadrao() {
        initComponents();
        this.jTfID.setVisible(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.bErro = false;
        this.setLocationRelativeTo(null);
        this.lstCons = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btConfirmar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jTfID = new javax.swing.JTextField();
        btSelecionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 3));

        btConfirmar.setText("Confirmar");
        btConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfirmarMouseClicked(evt);
            }
        });
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSelecionar.setText("Consultar");
        btSelecionar.setName("btnSalvar"); // NOI18N
        btSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSelecionarMouseClicked(evt);
            }
        });
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.setName("btnSalvar"); // NOI18N
        btLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimparMouseClicked(evt);
            }
        });
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTfID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btSelecionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btExcluir)
                    .addComponent(btSelecionar)
                    .addComponent(jTfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        this.salvar();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (!getJtfID().getText().equals("")) {
            if (JOptionPane.showConfirmDialog(this, "Deseja confirmar a exclusão?") == 0) {
                try {
                    this.excluir();
                    this.dispose();
                } catch (RollbackException ex) {
                    JOptionPane.showMessageDialog(this,
                                                  "Não é possível excluir, há algum outro cadastro que depende do cadastro desta tela.");
                }
            }
        } else
            JOptionPane.showMessageDialog(this, "Não há nada selecionado para exclusão.");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSelecionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSelecionarMouseClicked
        this.selecionar();
    }//GEN-LAST:event_btSelecionarMouseClicked

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfirmarMouseClicked
        
    }//GEN-LAST:event_btConfirmarMouseClicked

    public void confirmar(Factory fact, Object obj, String pers) {  
        if (getJtfID().getText().equals("")) {
            if (JOptionPane.showConfirmDialog(this, "Deseja confirmar o cadastro?") == 0) {
                fact.salvar(obj, pers);
                this.dispose();
            }
        } else {
            if (JOptionPane.showConfirmDialog(this, "Deseja confirmar a alteração?") == 0) {   
                fact.alterar(obj);
                this.dispose();
            }
        }
    }
    
    protected JTextField getJtfID() {
        return this.jTfID;
    }
    
    private MaskFormatter getMascara(String mascara) {
        MaskFormatter masc = null;
        try {
            masc = new MaskFormatter(mascara);
            masc.setPlaceholderCharacter(' ');
        } catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
        }
        return masc;
    }
    
    protected MaskFormatter getMascData() {
        return this.getMascara("##/##/####");
    }
    
    protected MaskFormatter getMascCPF() {
        return this.getMascara("###.###.###-##");
    }
    
    protected MaskFormatter getMascRG() {
        return this.getMascara("#.###.###");
    }

    protected MaskFormatter getMascNum(String masc) {
        return this.getMascara(masc);
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String strTrim(String str) {
        String trim = "";
        for (int i = 0; i < str.length(); i++) 
            if (str.charAt(i) != ' ')
                trim = trim + str.charAt(i);
        return trim;
    }
    
    protected String formatarData(String data) {
        return data.substring(8, 10) + '/' +
               data.substring(5, 7) + '/' +
               data.substring(0, 4);
    }
    
    private void erroData(String msg) {
        if (!this.bErro) {
            JOptionPane.showMessageDialog(null, msg);
            this.bErro = true;
        }
    }

    public Date validarData(String nmData, String data, String condicao) {
        Date dtFormat = null;
        if (!data.equals("  /  /    ")) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                                .ofPattern("dd/MM/uuuu")
                                .withResolverStyle(ResolverStyle.STRICT);
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                LocalDate.parse(data, dateTimeFormatter);                
                try {
                    dtFormat = formatter.parse(data);
                    String formDtHoje = this.formatarData(LocalDate.now().toString()); 
                    
                    if (condicao.equalsIgnoreCase("maior")) 
                        if (dtFormat.getTime() < formatter.parse(formDtHoje).getTime()) 
                            this.erroData("Data de "+nmData+" precisa ser maior ou igual à data de hoje.");
                    if (condicao.equalsIgnoreCase("igual")) 
                        if (dtFormat.getTime() != formatter.parse(formDtHoje).getTime()) 
                            this.erroData("Data de "+nmData+" precisa ser igual à data de hoje.");
                } catch(ParseException ex) {
                
                }    
            } catch (DateTimeParseException e) {
                this.erroData("Data de "+nmData+" inválida, verifique.");
            } 
        }
        return dtFormat;
    }
    
    protected String validarInteiro(char caract) {
        String inteiros = "0123456789";
        boolean contem = false;
        String valor = "";
        for (int i = 0; i < inteiros.length(); i++)
            if (caract == inteiros.charAt(i))
                contem = true;
       
        if (contem)
            valor = caract + "";
        return valor;
    }
    
    protected String validarDecimal(char caract) {
        String decimal = "0123456789,";
        boolean contem = false;
        String valor = "";
        for (int i = 0; i < decimal.length(); i++)
            if (caract == decimal.charAt(i))
                contem = true;  
        if (contem)
            valor = caract + "";
        return valor;
    }
    
    public String getApenasNros(String var, KeyEvent evt, JTextField jTF) {
        if (var.equals(""))
            return this.getNumFormatado(jTF);
        else 
        if (evt.getKeyCode() != 8)
            return var + this.validarInteiro(evt.getKeyChar());
        else
            return var.substring(0, var.length() - 1);
    }
    
    public String getDecimaisAux(String getDecim) {
        ArrayList<String> lstNum = new ArrayList();
        String posVirg = "";
        String antVirgAux;
        String antVirg = "";
        
        if (getDecim.contains(",")) {
            antVirgAux = getDecim.substring(0,getDecim.indexOf(","));
            posVirg = getDecim.substring(getDecim.indexOf(","));
        } else
            antVirgAux = getDecim;
        String decim = "";

        for (int i = 0; i < antVirgAux.length(); i++) 
            if (antVirgAux.charAt(i) != '.')
                antVirg = antVirg + antVirgAux.charAt(i);
            
        for (int i = antVirg.length() - 1; i >= 0; i--) {
            decim = antVirg.charAt(i) + decim;
            if ((decim.length() == 3) || i == 0) {
                lstNum.add(decim);
                decim = "";
            }
        }
        for (int i = lstNum.size()-1; i >= 0; i--) {
            if (lstNum.get(i).length() == 3)
                decim = decim + '.' + lstNum.get(i);
            else
                decim = decim + lstNum.get(i);
        }
        if (decim.charAt(0) != '.')
            return decim.substring(0, decim.length()) + posVirg;
        else
            return decim.substring(1, decim.length()) + posVirg;
    }

    public String getDecimais(String var, KeyEvent evt, JTextField jTF) {
        if (evt.getKeyCode() != 8)
            return this.getDecimaisFrmt(var, evt, jTF);
        else {
            if (jTF.getText().length() > 1) 
                return this.getDecimaisFrmt(var, evt, jTF);
            else
                return "";
        }
    }
    
    public String getDecimaisFrmt(String var, KeyEvent evt, JTextField jTF) {
        if (var.equals("") && !jTF.getText().equals(","))
            return this.getDecimaisAux(this.getDeciamlFormat(jTF));
        else 
        if (evt.getKeyCode() != 8) {
            if (!var.contains(",")) {
                if (!(var + this.validarDecimal(evt.getKeyChar())).equals(","))
                    return this.getDecimaisAux(var + this.validarDecimal(evt.getKeyChar()));
                else
                    return "";
            } else
                if (evt.getKeyChar() != ',')
                    return this.getDecimaisAux(var + this.validarDecimal(evt.getKeyChar()));
                else
                    return this.getDecimaisAux(var);
        } else 
            return this.getDecimaisAux(var.substring(0, var.length() - 1));
    }
    
    protected String getNumFormatado(JTextField jTFCampo) {
        String numero = "";
        for (int i = 0; i < jTFCampo.getText().length(); i++)
            if (!this.validarInteiro(jTFCampo.getText().charAt(i)).equals(""))
                numero = numero + jTFCampo.getText().charAt(i);
        return numero;
    }
    
    protected String getDeciamlFormat(JTextField jTFCampo) {
        String numero = "";
        for (int i = 0; i < jTFCampo.getText().length(); i++)
            if (!this.validarDecimal(jTFCampo.getText().charAt(i)).equals(""))
                numero = numero + jTFCampo.getText().charAt(i);
        return numero;
    }
    
    public int getAnosEntDt(String data) {
        String formDtHoje = this.formatarData(LocalDate.now().toString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        try {
            data1.setTime(sdf.parse(data));
            data2.setTime(sdf.parse(formDtHoje));
            
            int idade = data2.get(Calendar.YEAR) - data1.get(Calendar.YEAR);
            boolean bissexto = false;
            if (data1.get(Calendar.YEAR) % 400 == 0)
                bissexto = true;
            if ((data1.get(Calendar.YEAR) % 4 == 0) && (data1.get(Calendar.YEAR) % 100 != 0))
                bissexto = true;
            
            if (bissexto) {
                if ((data2.get(Calendar.MONTH) >= data1.get(Calendar.MONTH)) && 
                    ((data2.get(Calendar.DAY_OF_YEAR) + 1) < data1.get(Calendar.DAY_OF_YEAR)))
                    idade = idade - 1;
            } else {
                if ((data2.get(Calendar.MONTH) >= data1.get(Calendar.MONTH)) && 
                    (data2.get(Calendar.DAY_OF_YEAR) < data1.get(Calendar.DAY_OF_YEAR)))
                    idade = idade - 1;
            }
            return idade;
        } catch (ParseException e) {
            return -1;
        }
    }
    
    public List<ConsPadrao> getLstCons() {
        return this.lstCons;
    }
    
    protected void addLstCons(ConsPadrao conPad) {
        this.lstCons.add(conPad);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTfID;
    // End of variables declaration//GEN-END:variables
}