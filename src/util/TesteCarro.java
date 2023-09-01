/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.CarroFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteCarro {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        /*Carro car = new Carro();
        car.setNome("Palio");
        car.setAno(1998);
        car.setDono(new Cliente(1, "Cadavér1khx", 27, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(5, "bruno", "123", "Comum")));
        car.setPlaca("SUL-XLLY");
        car.setCidade("Blumenau");
        car.setUf("SC");
        car.setPais("Brasil");
        car.setMarca("Fiat");
        new CarroFactory().salvar(car);*/
        
        Carro car = new Carro();
        car.setNome("C4");
        car.setAno(2008);
        car.setDono(new Cliente(2, "Bruno Luiz Reinicke", 27, "Masculino", "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(5, "bruno", "123", "Comum")));
        car.setPlaca("BBB-0001");
        car.setCidade("Blumenau");
        car.setUf("SC");
        car.setPais("Brasil");
        car.setMarca("Citroen");
        new CarroFactory().salvar(car);
       
        // Consulta
        /*List<Carro> lstCarro = (List<Carro>) new CarroFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstCarro.forEach((carro) -> {
            System.out.println(carro.toString());
        });
        
        // Consulta
        List<Carro> lstCarro3 = (List<Carro>) new CarroFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstCarro3.forEach((carro) -> {
            System.out.println(carro.toString());
        });*/
    }
}