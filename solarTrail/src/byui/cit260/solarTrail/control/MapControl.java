/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrail.control;

/**
 *
 * @author BHart
 */
public class MapControl extends Control
{

    public MapControl()
    {
        super("\t*************"
                + "\t*    Map    *"
                + "\t*************");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered

        switch (choice)
        {
            case 'T': //Travel 
                System.out.println("selectItem function");
                break;
            case 'H': //Harvest Resources 
                System.out.println("healStatus function");
                break;
            case 'S': //Ship Menu
                System.out.println("shipControl function");
                break;
            case 'Q': //Quit
                System.exit(0);
                break;
            default:
                System.out.println("\n***Invalid Selection.  Try Again.***");
                break;
        }
        return true;
    }
}
