/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.factorymethod;

/**
 *
 * @author tomek
 */
public class AbstractCannon implements I_AbstractCannon
{
   protected E_CannotType cannonType;
   protected int fireRate;
   protected int armor;
   protected int shotPower;
   protected int fireRange;
   protected float price;

    @Override
    public E_CannotType getCannonType() {
        return cannonType;
    }

    @Override
    public int getFireRange() {
        return fireRate;
    }

    @Override
    public int getFireRate() {
        return fireRate;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getShotPower() {
        return shotPower;
    }

    @Override
    public float getPrice() {
        return price;
    }
    
   @Override
    public String toString()
    {
        return "CANNON TYPE: " + cannonType + "\nFIRE RATE: " + fireRate; 
    }
    
    
   
    
   
   
}
