package com.example;

public class ContoCorrente {
    private String titolare_conto;
    private Double saldo_conto;

    public ContoCorrente(String titolare, Double saldo){
        if(saldo<0){
            throw new IllegalArgumentException();
        } else{
            this.titolare_conto = titolare;
            this.saldo_conto = saldo;
        }
    }

    public void desposito(double importo) throws IllegalArgumentException{
        if(importo<=0){
            throw new IllegalArgumentException();
        } else{
            this.saldo_conto += importo;
        }
    }

    public void prelievo(double importo) throws IllegalArgumentException, SaldoInsufficienteException{
        if(importo<=0){
            throw new IllegalArgumentException();
        } else if(importo>this.saldo_conto){
            throw new SaldoInsufficienteException("Stai cercando di prelevare di più rispetto a cio' che possiedi");
        } else{
             this.saldo_conto -= importo;
        }

    }
    public Double getSaldoConto(){
        return this.saldo_conto;
    }

}
