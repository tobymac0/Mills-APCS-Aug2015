
/**
 * Write a description of class faces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class faces
{
    //make a face
    public static void topofhead()  {
        for(int line=1; line<=7; line++)  {
            for(int i=1; i<=line; i++)  {
        System.out.print(" ");
    }
    for(int j=1; j<=(11-2*j); j++)  {
        System.out.println("*");
    }
}
}

public static void faceofhead()  {
    for(int i=1; i<=10; i++)  {
        for(int j=1; j<=5; j++) {
            System.out.println("//\\");
        }
    }
}
public static void bottomofhead()  {
    for(int i=1; i<=10; i++)  {
        for(int j=1; j<=3; j++)  {
            System.out.print("<><><><><><>");
        }
        System.out.println(" ");
    }
}

public static void main(String[] args)  {
    topofhead();
    faceofhead();
    topofhead();
    bottomofhead();
        
}
}