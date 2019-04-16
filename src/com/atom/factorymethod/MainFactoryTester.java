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
public class MainFactoryTester {
    public static void main(String[] args) {
        
        CannonsCreator cannonsCreator = CannonsCreator.getInstance();
        I_AbstractCannon laserCannon = cannonsCreator.create(E_CannotType.LASER_CANNON);
        I_AbstractCannon machineCannon = cannonsCreator.create(E_CannotType.MACHINE_CANNON);
        I_AbstractCannon plasmaCannon = cannonsCreator.create(E_CannotType.PLASMA_CANNON);
        
        System.out.println(laserCannon);
        System.out.println(machineCannon);
        System.out.println(plasmaCannon);
    }
}
