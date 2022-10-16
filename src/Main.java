import w7d1Homework.Pet;
import w7d1Homework.ToDoItem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> petList = new ArrayList<>(3);
        ArrayList<ToDoItem> toDoList = new ArrayList<>(3);

        /*
        *  Verify Pet class works as expected
        */

        // add pet without passing info
        petList.add(new Pet());

        // add pets with info
        petList.add(new Pet("Fluffy", 5, "Cat Lounge 1", "Cat"));
        petList.add(new Pet("Loki", 28, "Big Cage 5", "Bird"));

        // loop through petList and display each one individually
        System.out.println("\nPets in petList (displayed individually):");
        for(Pet pet : petList) {
            System.out.println(pet.toString());
        }

        // just print petlist
        System.out.println("\n\nPrinting entire petList:");
        System.out.println(petList);

        // display individual attributes for first pet in petList using getters
        System.out.println("\n\nCurrent Info for First Pet (using getters):");
        System.out.println("Name: " + petList.get(0).getName());
        System.out.println("Age: " + petList.get(0).getAge());
        System.out.println("Location: " + petList.get(0).getLocation());
        System.out.println("Type: " + petList.get(0).getType());

        // update first pet in petList with new information using setters
        petList.get(0).setName("Jagger");
        petList.get(0).setAge(17);
        petList.get(0).setLocation("My Lap");
        petList.get(0).setType("Longhair miniature Dachshund");

        // display updated information for first pet in petList using
        //      class' toString method
        System.out.println("\nNew Info for First Pet (using toString):");
        System.out.println(petList.get(0).toString());

        //**********************************************************

        // print separator line between Pet and ToDoItem tests
        System.out.println();
        for (int loop = 0; loop < 80; loop++) {
            System.out.print("*");
        }
        System.out.println();

        /*
         *  Verify ToDoItem class works as expected
         */

        // Add toDoItem item with no parameters
        toDoList.add(new ToDoItem());

        // Add toDoItem item with 2 parameters
        toDoList.add(new ToDoItem("Medium Priority ToDo Item", 5));

        // Add toDoItem item with 3 parameters
        toDoList.add(new ToDoItem("High Priority ToDo Item", 10, true));

        // loop through toDoList and display each one individually with toString
        System.out.print("\nToDoItems in toDoList (displayed individually & unsorted):");
        for(ToDoItem toDoItem : toDoList) {
            System.out.print(toDoItem.toString());
        }
        System.out.println();

        // just print toDolist
        System.out.println("\n\nPrinting toDoList collectively:");
        System.out.println(toDoList);

        // display individual attributes for first task in toDoList using getters
        System.out.println("\n\nCurrent Info for First ToDoItem (using getters):");
        System.out.println("Task: " + toDoList.get(0).getTask());
        System.out.println("Priority: " + toDoList.get(0).getPriority());
        System.out.println("Completed: " + toDoList.get(0).getCompleted());

        // update first pet in petList with new information using setters
        toDoList.get(0).setTask("Low Priority ToDo Item");
        toDoList.get(0).setPriority(1);
        toDoList.get(0).setCompleted(true);

        // display updated information for first task in toDoList using
        //      class' toString method
        System.out.print("\nNew Info for First toDoItem (using toString):");
        System.out.println(toDoList.get(0).toString());

        // Sort list by priority
        Collections.sort(toDoList);

        // print toDoList after sorting by priority
        System.out.println("\n\nPrinting toDoList Sorted by Priority");
        System.out.println(toDoList);
    }
}

