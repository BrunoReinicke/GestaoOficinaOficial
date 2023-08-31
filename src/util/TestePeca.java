/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.PecaFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Fornecedor;
import modelo.bean.Peca;

/**
 *
 * @author bruno
 */
public class TestePeca {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Peca pe = new Peca();
        pe.setNome("Carburador");
        pe.setAno(2021);
        pe.setPreco(1000);
        pe.setMarca("random");
        pe.setForn(new Fornecedor(1, "Random", 42, "Masculino", "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe.setCategoria("Média");
        pe.setQtde(5);
        new PecaFactory().salvar(pe);
        
        // Consulta
        /*List<Peca> lstPeca = (List<Peca>) new PecaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstPeca.forEach((peca) -> {
            System.out.println(peca.toString());*/
    }
}