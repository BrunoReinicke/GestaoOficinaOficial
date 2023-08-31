/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.FornecFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.bean.Fornecedor;
import java.util.List;
/**
 *
 * @author bruno
 */
public class TesteFornecedor {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Fornecedor forn3 = new Fornecedor();
        forn3.setNome("Random");
        forn3.setIdade(42);
        forn3.setSexo("Masculino");
        forn3.setCpf("***.***.***-**");
        forn3.setRg("*.***.***");
        forn3.setDataNasc(formato.parse("14/01/1980"));
        forn3.setCidade("Pomerode");
        forn3.setUf("SC");
        forn3.setPais("Brasil");
        new FornecFactory().salvar(forn3);
    }
}