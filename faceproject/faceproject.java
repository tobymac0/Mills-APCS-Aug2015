
/**
 * Write a description of class faceproject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class faceproject
{
    //make top of head and bottom
   public static void topofhead()  {
       for(int i=1; i<=20; i++)  {
           System.out.print("-");
        }
        System.out.println(" ");
    }
    //print sides of faces
    public static void doublesideface()  {
        System.out.print("|");
        for(int i=1; i<=20; i++)  {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println(" ");
    }
    //make eyes
    public static void eyes()  {
        for(int i=1; i<=3; i++)  {
            System.out.print(" ");
        }
        System.out.print("/-\\");
        for(int j=1; j<=8; j++)  {
            System.out.print(" ");
        }
        System.out.print("/-\\");
        System.out.println(" ");
    }
    public static void 
    public static void main(String[] args)  {
        topofhead();
        doublesideface();
        doublesideface();
        eyes();
    }
}


