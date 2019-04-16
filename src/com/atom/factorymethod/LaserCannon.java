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
public class LaserCannon extends AbstractCannon{
    
    LaserCannon()
    {
        this.cannonType = E_CannotType.LASER_CANNON;
        this.fireRate = 100;
        this.fireRange = 50;
        this.armor = 30;
        this.shotPower = 70;
    }
    
    void setPrice(float price)
    {
        this.price = price;
    }
}
