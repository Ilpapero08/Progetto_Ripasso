package com.example;

public class Main {
    public static void main(String[] args) {
        ContoCorrente c = new ContoCorrente("Mattia De Pace", 100.0);
        try{
            c.desposito(20.0);
            c.prelievo(30.0);
            
            c.prelievo(120.0);
            c.desposito(-20.0);
        } catch(SaldoInsufficienteException e){
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Operzione completata. saldo finale: " + c.getSaldoConto() + "€");
        }
    }
}