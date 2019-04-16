/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.singleton;

/**
 *
 * @author tomek
 */
public class Singleton2 
{
    // STAŁA przechowująca jedną instancję klasy
    public static final Singleton2 INSTANCE =  new Singleton2();    
    public String name;
    private Singleton2()
    {
        System.out.println("Klasa Singleton2");        
    }    
}
