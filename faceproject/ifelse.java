
/**
 * Write a description of class ifelse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java .util.*;

public class ifelse
{
    public static void ifelse()  {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi respond with yes if you would like to learn more");
        System.out.println("Respond with bye if you would leave");
        String a = userInput.nextLine();
        if(a.equals("yes"))  {
            System.out.println("DEEZ nuts got heem");
        } else  {
            System.out.println("too bad you can't leave");        
            System.out.println("say yes or bye");
        }
        String b = userInput.nextLine();
        if(b.equals("yes"))  {
            System.out.println("DEEZ nuts got heem");
        } else {
            System.out.println("too bad you can't leave");
            System.out.println("say yes or bye");
        }
}
    public static void main(String[] args)  {
        ifelse();
    }
}
