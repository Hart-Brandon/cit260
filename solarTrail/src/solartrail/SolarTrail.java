/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrail;

import byui.cit260.solarTrail.model.Actor;
import byui.cit260.solarTrail.model.CargoHold;
import byui.cit260.solarTrail.model.Game;
import byui.cit260.solarTrail.model.InventoryItem;
import byui.cit260.solarTrail.model.Location;
import byui.cit260.solarTrail.model.Map;
import byui.cit260.solarTrail.model.Player;
import byui.cit260.solarTrail.model.Ship;
import byui.cit260.solarTrail.model.VisitPlanetScene;

/**
 *
 * @author BHart and RDunn
 */
public class SolarTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Start Test Player class
      Player playerOne = new Player();
      
      playerOne.setName("Steve Rogers");
      playerOne.setHighscore(1500);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      //End Test
      
      //Start Test Ship class
      Ship theKestral = new Ship();
      
      theKestral.setDescription("A bird of prey");
      theKestral.setActualCrewSize(5);
      theKestral.setCargoCapacity(500);
      theKestral.setStatus("Damaged plenty, but she'll fly true.");
      theKestral.setMaxCrewCapacity(10);
      theKestral.setMinCrewCapacity(1);
      theKestral.setSize(30);
      theKestral.setSpeed(600);
      
      String shipInfo = theKestral.toString();
      System.out.println(shipInfo);
      //End Test
      
      //Start Test VisitPlanetScene class
      VisitPlanetScene sceneOne = new VisitPlanetScene();
      
      sceneOne.setBlocked(true);
      sceneOne.setDescription("Yay scene!");
      sceneOne.setFoodAvailable(10);
      sceneOne.setFuelAvailable(5);
      sceneOne.setSymbol("None");
      sceneOne.setTravelTime(21.5);
      sceneOne.setWaterAvailable(15);
      
      String sceneInfo = sceneOne.toString();
      System.out.println(sceneInfo);
      //End Test
     
      //Start Test Actor class
      Actor actorOne = new Actor();
      
      actorOne.setName("Bruce Banner");
      actorOne.setDescription("A small man with glasses");
      actorOne.setHighscore(700);
            
      String actorInfo = actorOne.toString();
      System.out.println(actorInfo);
      //End Test     
      
       //Start Test CargoHold class
      CargoHold CargoOne = new CargoHold();
      
      CargoOne.setMaxQuantity(160);
                
      String CargoInfo = CargoOne.toString();
      System.out.println(CargoInfo);
      //End Test    
      
      //Start Test Game class
      Game GameOne = new Game();
      
      GameOne.setTotalTime(90);
                
      String GameInfo = GameOne.toString();
      System.out.println(GameInfo);
      //End Test
      
      //Start Test InventroyItem class
      InventoryItem FoodBars = new InventoryItem();
      
      FoodBars.setDescription("Protein in all the colors of the rainbow.");
      FoodBars.setInventoryType("Food");
      FoodBars.setQuantityInStock(60);
      FoodBars.setRequiredAmount(55);
                
      String InventoryInfo = FoodBars.toString();
      System.out.println(InventoryInfo);
      //End Test
      
      //Start Test Location class
      Location MarsBase = new Location();
      
      MarsBase.setColumn(3);
      MarsBase.setRow(4);
      MarsBase.setVisited(true);
                      
      String LocationInfo = MarsBase.toString();
      System.out.println(LocationInfo);
      //End Test
    
      //Start Test Map class
      Map GameMap = new Map();
      
      GameMap.setColumnCount(6);
      GameMap.setRowCount(10);
                            
      String MapInfo = GameMap.toString();
      System.out.println(MapInfo);
      //End Test
      
    }
}
