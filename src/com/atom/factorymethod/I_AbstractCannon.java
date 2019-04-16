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
public interface I_AbstractCannon {
    public abstract E_CannotType getCannonType();
    public abstract int getFireRate();
    public abstract int getArmor();
    public abstract int getShotPower();
    public abstract int getFireRange();
    public abstract float getPrice();
}
