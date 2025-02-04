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

ArrayList<String> toBuy = new ArrayList<String>();

toBuy.add("Giraffe");
toBuy.add("Oranges");
toBuy.add("Orange paint");
toBuy.add("Playing cards");

toBuy.add(0, "Finny");
System.out.println(toBuy);

int lastIndex = toBuy.size() - 1; 
String lastElement = toBuy.get(lastIndex);

System.out.println(lastElement);

// .set(int index, obj) REPLACES element at that index with the new obj
// returns the replaced element ( same type as the list holds )
String replaced = toBuy.set(1, "carrot");
System.out.println(toBuy);

toBuy.set(3, " not orange paint");
System.out.println(toBuy);

String removed = toBuy.remove(3);
System.out.println(toBuy);
System.out.println("Take" + removed + " out of the shopping cart, now.");

// PRACTICE 

ArrayList<String> toDoList = new ArrayList<String>();
toDoList.add("Do homework");
toDoList.add("Help make dinner");
toDoList.add("Call grandma");

System.out.println(toDoList);
toDoList.set(1, "Order pizza");

System.out.println(toDoList);
String leftToDo = toDoList.size() + " thing's left to do";

System.out.println(leftToDo);

System.out.println("The first thing to do is to " + toDoList.get(0) );

toDoList.remove(0);
System.out.println(toDoList);



      
   }
}
