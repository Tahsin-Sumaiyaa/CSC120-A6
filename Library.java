/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{
  
  //Attributes
  private Hashtable<String, Boolean> collection = new Hashtable<>();

  //Library Constructor
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection){
    super(name, address, nFloors);
    this.collection=collection;
    System.out.println("You have built a library: 📖");
  }

  //Method to find if a book is in the collection or not
  public boolean containsTitle(String title){
    return collection.contains(title);
  } // returns true if the title appears as a key in the Libary's collection, false otherwise


  //Method to find if a book is avaiable or not
  public boolean isAvailable(String title){
    return collection.containsKey(title) && collection.get(title);
  } // returns true if the title is currently available, false otherwise


  //Method to check out books
  public void checkOut(String title){
    if(collection.containsKey(title)&& collection.get(title)){
      collection.put(title,false);
      System.out.println("Book is successfully checked out: "+ title);
    }else{
      System.out.println("Book is not avaiable for check-out.");
    }
  }

  //Method to return books
  public void returnBook(String title){
    if(collection.containsKey(title)){
      collection.put(title, true);
      System.out.println("Book is successfully returned: "+ title);
    }else{
      throw new RuntimeException("Book already exist in the inventory.");
    }
  }

  //Method to print the entire collection
  public void printCollection(){
    System.out.println(collection);
  } // prints out the entire collection in an easy-to-read way (including checkout status)

  //Defining toString() method
  public String toString(){
    return super.toString()+", the library's book collection contains: "+collection;
  }
  
  public static void main(String[] args) {

    //Creating a Hashmap for the new Library instance
    Hashtable<String, Boolean> library_One_Collection= new Hashtable<>();
    library_One_Collection.put("Thinking, Fast and Slow; Daniel Kahneman", true);
    library_One_Collection.put("Flatland; Edwin Abbott", true);
    library_One_Collection.put("Atlas Shrugged; Ayn Rand", true);

    //Creating a Library instance and testing
    Library library_One= new Library("Neilmoon", "Elm Street", 4, library_One_Collection);

    System.out.println(library_One);
    library_One.printCollection();


    library_One.isAvailable("Flatland; Edwin Abbott");
    library_One.containsTitle("gg");
    library_One.checkOut("Atlas Shrugged; Ayn Rand");
    library_One.printCollection();
    library_One.returnBook("Atlas Shrugged; Ayn Rand");
    library_One.printCollection();
  }
  
}