
/**
 * Write a description of class Homecoming2k15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java .util.*;

public class homecomingprojecttoby
{
      public static void getADATE()  {
          Scanner userInput = new Scanner(System.in);
        System.out.println("Hi! my name is Tobias");
        System.out.println("What's your name?");
        String name =   userInput.nextLine();
        System.out.println("Nice to meet you ");
        System.out.println("Would you like to go to Homecoming with me?");
        String answer = userInput.nextLine();
        if(answer.equals("yes"))  {
            System.out.println("this is going to be the best day of my life");
        } else if(answer.equals("no"))  {
            System.out.println("you're missing out");
        } else {
            System.out.println("its a yes or no question buddy");
        }
        
        System.out.println();
        System.out.println("Great! It'll be a magical night Tobias and  going to Mills Homecoming Dance 2015!");
        
        
    }
     public static void damage()  {
         Scanner console = new Scanner(System.in);
        System.out.println("Let's  figure out the damage for the evening");
        System.out.println();
        System.out.println("What are your estimated costs?");
        System.out.println("Tickets(each): ");
        int tickets = console.nextInt();
        System.out.println("Flowers(total for both of us): ");
        int flowers = console.nextInt();
        System.out.println("pictures:  ");
        int pictures = console.nextInt();
        System.out.println("Dinner(per meal):  ");
        int dinner = console.nextInt();
        System.out.println("New clothes:  ");
        int newclothes = console.nextInt();
        System.out.println("Any other expenses:  ");
        int other = console.nextInt();
        System.out.println();
        System.out.println("So you should expect to spend, including tax,  ");
        System.out.println("If we split the costs then we will each pay:  ");
    }
    
   
    
    public static void statsTable(int tickets, int flowers, int pictures, int dinner, int newclothes, int other) {
        System.out.println("MHS Homecoming 2015");
        System.out.println("vickie viking and Tobias ");
        System.out.println("Tickets-Total: " + tickets);
        System.out.println("Flowers(for both of you): " + flowers);
        System.out.println("Dinner(for two): " + dinner);
        System.out.println("New clothes: " + newclothes);
        System.out.println("Any other expenses: " + other);
        System.out.println("subtotal: ");
        System.out.println("Sales tax ");
        System.out.println("Total ");
    }
    public static void main(String[] args)  {
       getADATE();
       damage();
       
        
}
}
  