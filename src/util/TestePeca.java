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
        pe.setNome("Radiador");
        pe.setAno(2021);
        pe.setPreco(1000);
        pe.setMarca("random");
        pe.setForn(new Fornecedor(1, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe.setCategoria("Média");
        new PecaFactory().salvar(pe);
        
        // Consulta
        /*List<Peca> lstPeca = (List<Peca>) new PecaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstPeca.forEach((peca) -> {
            System.out.println(peca.toString());
        });
        
        // Alteração 
        Peca pe2 = new Peca();
        pe2.setId(6);
        pe2.setNome("Radiador");
        pe2.setAno(2022);
        pe2.setPreco(1500);
        pe2.setMarca("BBBAAA");
        pe2.setForn(new Fornecedor(3, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe2.setCategoria("Média");
        new PecaFactory().alterar(pe2);
        
        // Exclusão
        new PecaFactory().excluir(7);
        
        // Consulta
        List<Peca> lstPeca3 = (List<Peca>) new PecaFactory().consultar(8);
        System.out.println("Consulta com filtro:");
        lstPeca3.forEach((peca) -> {
            System.out.println(peca.toString());
        });*/
    }
}