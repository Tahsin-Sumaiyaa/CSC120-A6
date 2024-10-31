/* This is a stub for the Cafe class */

import java.util.HashMap;

public class Cafe extends Building{

    //Attributes
    private HashMap<String, Integer> inventory= new HashMap<>();
    
    /*private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
 */
    //Creating Cafe Constructor
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces,int nSugarPackets, int nCreams, int nCups) {
        super(name,address,nFloors);
        
        inventory.put("Coffee Ounces", nCoffeeOunces);
        inventory.put("Sugar Packets", nSugarPackets);
        inventory.put("Creams", nCreams);
        inventory.put("Cups", nCups);

        System.out.println("You have built a cafe: ☕");
    }

    //Method to sell coffee
    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams){
        if( inventory.get("Coffee Ounces")>= nCoffeeOunces &&
            inventory.get("Sugar Packets")>= nSugarPackets &&
            inventory.get("Creams")>= nCreams &&
            inventory.get("Cups")>= 1){

            inventory.put("Coffee Ounces", inventory.get("Coffee Ounces")- nCoffeeOunces);
            inventory.put("Sugar Packets", inventory.get("Sugar Packets")- nSugarPackets);
            inventory.put("Creams", inventory.get("Creams")- nCreams);
            inventory.put("Cups", inventory.get("Cups")- 1);

        }else{
            System.out.println("Not enough stock in the inventory to make the coffee.");
        }
    }

    //Method to restock inventory
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        inventory.put("Coffee Ounces",inventory.get("Coffee Ounces")+ nCoffeeOunces);
        inventory.put("Sugar Packets",inventory.get("Sugar Packets")+ nSugarPackets);
        inventory.put("Creams",inventory.get("Creams")+ nCreams);
        inventory.put("Cups",inventory.get("Cups")+ nCups);
    }

    //Defining toString() method
        public String toString(){
        return super.toString()+", the cafe's inventory contains: "+inventory;
    }
    
    public static void main(String[] args) {

        //Creating cafe instance and testing
        Cafe cafe_One= new Cafe("BlueLight", "Green Street", 1, 100, 100, 100, 100);

        System.out.println(cafe_One);
        System.out.println(cafe_One.inventory);
        cafe_One.restock(0, 0, 0, 0);

        //Selling coffee
        cafe_One.sellCoffee(2, 0, 3);
        System.out.println("Now the inventory contains: "+cafe_One.inventory);

    }
    
}
