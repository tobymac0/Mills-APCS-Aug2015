
/**
 * draw christmas trees
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drawtrees
{
    public static void treetops()  {
        for(int line=4; line>=1; line--)  {
            for(int i=1; i<= (line-1); i++)  {
                System.out.print(" ");
            }
            for(int i=1; i<= (11-2*line); i++)  {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void treetrunk()  {
        for(int j=1; j<=4; j++)  {
            System.out.println("    *");
        }
        for( int k=1; k<=9; k++)  {
            System.out.print("*");
        }
    }
    public static void main(String[] args)  {
        treetops();
        treetops();
        treetrunk();
        treetops();
        treetops();
        treetrunk();
    }
}
        
