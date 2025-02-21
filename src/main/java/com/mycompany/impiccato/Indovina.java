/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impiccato;


/**
 *
 * @author fonta
 */
public class Indovina {
    private String parolaDaIndovinare; 

    public Indovina(String parolaDaIndovinare) {
        this.parolaDaIndovinare = parolaDaIndovinare;
    }
    
    /**
     * metodo per controllare se la parola dell'utente è corretta
     * @param parolaUtente
     * @return true = corretta | false = sbagliata 
     */
    public boolean StringaIsCorretta(String parolaUtente){
        if(parolaDaIndovinare.equals(parolaUtente)){
            return true;
        }else{
            return false;
        }
    }
    

    
    
    
    

    
    
    
}
