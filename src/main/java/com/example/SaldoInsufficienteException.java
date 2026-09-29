package com.example;

public class SaldoInsufficienteException extends Exception{
    public SaldoInsufficienteException(String messaggio_errore){
        super(messaggio_errore);
    }
}
