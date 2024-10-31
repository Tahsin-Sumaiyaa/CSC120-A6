/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  //Attributes
  private ArrayList<String> residents = new ArrayList<>();
  boolean hasDiningRoom;

  //House Constructor
  public House(String name, String address, int nFloors, boolean hasDiningRoom, ArrayList<String> residents) {
    super(name,address,nFloors);
    System.out.println("You have built a house: 🏠");
  }

  //Method to add a resident
  public void moveIn(String name){
    if (!residents.contains(name)){
      residents.add(name);
    }else{
      throw new RuntimeException("Resident already present.");
    }
  }

  //Method to remove a resident
  public void moveOut(String name){
    if(residents.contains(name)){
      residents.remove(name);
    }else{
      throw new RuntimeException("No resident of such name exists.");
    }
  }

  //Define toString() method
  public String toString(){
    return super.toString()+",Residents:"+residents+", Has Dinning Room:"+hasDiningRoom;
  }

  //Main Method
  public static void main(String[] args) {

    //Creating an ArrayList for the new house instance
    ArrayList<String> house_One_Residents= new ArrayList<>();
    house_One_Residents.add("Sumaiya");

    //Creating a House instance and testing
    House house_One= new House("Pumpkin House", "1 Chapin Lane", 3, true, house_One_Residents);

    house_One.moveIn("Afi");
    //house_One.moveIn("Sumaiya");
    house_One.moveIn("Mim");
    house_One.moveIn("Maliha");
    house_One.moveOut("Mim");

    System.out.println(house_One);
  }

}