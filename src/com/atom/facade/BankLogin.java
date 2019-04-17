/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.facade;

/**
 *
 * @author twieszczura
 */
public class BankLogin {
    
    public boolean identyfikacja(long nrKarty, int pin)
    {
        if (nrKarty == 1234567890 && pin == 1234)
                return true;
        else
            return false;                
    }
    
    public void identyfikacjaWWW(String login, String haslo)
    {
        
    }
    
    public void identyfikacjaAppTel(String login, String haslo)
    {
        
    }
}
