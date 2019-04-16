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
public interface I_CannonCreator {
    public abstract I_AbstractCannon create(E_CannotType cannonType);
}
