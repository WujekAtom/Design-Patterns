/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.factory;

/**
 *
 * @author twieszczura
 */
public class Fiat extends Pojazd 
{
    private String marka = "FIAT";
    
    @Override
    public String getMarka()
    {
        return marka;
    }
}
