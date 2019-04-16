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

import com.atom.singleton.Singleton;

public class wzorceMain {
    public static void main(String[] args) 
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton2 s3 = Singleton2.INSTANCE;
        Singleton2 s4 = Singleton2.INSTANCE;
        
        s1.name = "Jurek";
        s2.name = "Gryzipiorek";
        
        s3.name = "Wujek";
        s4.name = "Atom";
        
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s4.name);
    }
}
