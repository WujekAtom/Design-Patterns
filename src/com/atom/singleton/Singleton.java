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
public class Singleton 
{
    private static Singleton instance = null;
    public String name;
    
    private Singleton()
    {
        System.out.println("Klasa singletona");
    }
    
    public static synchronized Singleton getInstance()
    {
        if (instance!=null)
            return instance;
        else
        {
            instance = new Singleton();
            return instance;
        }
            
    }
}
    

