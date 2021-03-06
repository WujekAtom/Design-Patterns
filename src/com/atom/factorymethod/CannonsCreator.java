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
public class CannonsCreator implements I_CannonCreator {

   private static CannonsCreator Instance;
   
   public static synchronized CannonsCreator getInstance()
   {
       if (Instance == null)
           Instance = new CannonsCreator();
       
       return Instance;
   }
   
   @Override
    public I_AbstractCannon create(E_CannotType cannonType) {
       I_AbstractCannon cannon;
       
       switch(cannonType)
       {
           case LASER_CANNON:
               LaserCannon laserCannon = new LaserCannon();
               laserCannon.setPrice(2000);
               cannon = laserCannon;
               break;
           case MACHINE_CANNON:
               MachineCannon machineCannon = new MachineCannon();
               machineCannon.setPrice(2000);
               cannon = machineCannon;
               break;
           case PLASMA_CANNON:
               PlasmaCannon plasmaCannon = new PlasmaCannon();
               plasmaCannon.setPrice(2000);
               cannon = plasmaCannon;
               break;
            default:
                cannon = null;
                break;
                       
                       
               
               
       }
               
       
       return cannon;
    }
    
}
