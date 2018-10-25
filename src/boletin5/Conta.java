/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author mrebelladofernandez
 */
public class Conta {

    private String nomeCliente;
    private String numConta;
    private double saldo;

//constructores
    public Conta() {
    }

    public Conta(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

//metodos de acceso
    public String setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String setnumConta(String numConta) {
        this.numConta = numConta;
    }

    public double setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return nomeCliente;
    }

    public String getnunConta(String numConta) {
        this.numConta = numConta;
        return numConta;
    }

    public double getsaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void mostrarDatos() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Numero de conta: " + numConta);
        System.out.println("Saldo disponible: " + saldo);
    }

    public boolean ingreso(double cantidade) {
       
        if (cantidade >= 0) {
            saldo = saldo + cantidade;
            return true;
        }
        else {
        return false;
        }
    }

    public void reintegro() {

    }
}
