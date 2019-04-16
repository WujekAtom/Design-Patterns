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
class PlasmaCannon extends AbstractCannon{
    
    PlasmaCannon()
    {
        this.cannonType = E_CannotType.LASER_CANNON;
        this.fireRate = 160;
        this.fireRange = 80;
        this.armor = 10;
        this.shotPower = 90;
    }
    
    void setPrice(float price)
    {
        this.price = price;
    }
}
