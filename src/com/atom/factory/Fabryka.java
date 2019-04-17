/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.factory;
import com.atom.factory.*;
/**
 *
 * @author twieszczura
 */
public class Fabryka 
{
    public static void main(String[] args) {
        
        Fabryka f = new Fabryka();
        Pojazd p = f.getPojazd("TESLA");
        Pojazd p1 = f.getPojazd("FIAT");
        Pojazd p2 = f.getPojazd("OPEL");
        
        System.out.println(p.getMarka());
        System.out.println(p.getClass().getName());
        System.out.println(p1.getMarka());
        System.out.println(p2.getMarka());
       
    }
   
    public Pojazd getPojazd(String marka)
    {
        Pojazd p;
        if (marka.equals("FIAT"))        
            p = new Fiat();     
        else 
            if (marka.equals("TESLA"))
                p = new Tesla();
            else
                p = new Pojazd();
        return p;
    }
    
}
