// Import the ArrayList class
//from the java.util package
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
      
      // Declaring
   ArrayList<String> buzzwords;
      // Setting up
     ArrayList shoppingList = new ArrayList();

     // ArrayLists can only store objects
     // so for int and double you must use their WRAPPER CLASSES
     ArrayList<Integer> ages = new ArrayList<Integer>();
     ArrayList<Double> testScores = new ArrayList<Double>();

     // Java will handle the "wrapping" for you,
     // this is called AUTOBOXING

     // use .add to fill a list
     testScores.add(40.00); // double gets wrapped into Double
     System.out.println(testScores);



      
   }
}
