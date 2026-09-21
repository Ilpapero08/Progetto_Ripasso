package com.example;

public class ContoCorrente {
    private String titolare_conto;
    private Double saldo_conto;

    public ContoCorrente(String titolare, Double saldo) throws IllegalArgumentException{
        if(saldo<0){
            throw new IllegalArgumentException();
        } else{

        }
    }
}
