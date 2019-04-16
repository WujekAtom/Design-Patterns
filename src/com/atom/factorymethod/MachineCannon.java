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
public class MachineCannon extends AbstractCannon {

    MachineCannon() 
    {
        this.cannonType = E_CannotType.MACHINE_CANNON;
        this.fireRate = 140;
        this.fireRange = 20;
        this.armor = 50;
        this.shotPower = 73;
    }
    
    void setPrice(float price)
    {
        this.price = price;
    }
}
