/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.example3;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(01, "robertin");
        Funcionario cicrano = new Funcionario(123, "maicon");
        Venda brinquedo = new Venda(321, cicrano, fulano);
        fulano.addVendaCliente(brinquedo);
        cicrano.addVendaFuncionario(brinquedo);
        
    }
}
