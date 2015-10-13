
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
       for(int i=1; i<=40; i++)  {
           System.out.print("-");
        }
        System.out.println(" ");
    }
    //print sides of faces
    public static void doublesideface()  {
        System.out.print("|");
        for(int i=1; i<=40; i++)  {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println(" ");
    }
    //make eyes
    public static void eyes()  {
        for(int i=1; i<=6; i++)  {
            System.out.print(" ");
        }
        System.out.print("/-\\");
        for(int j=1; j<=16; j++)  {
            System.out.print(" ");
        }
        System.out.print("/-\\");
        System.out.println(" ");
    }
    public static void eyesbottom()  {
        for(int i=1; i<=6; i++)  {
            System.out.print(" ");
        }
        System.out.print("\\-/");
        for(int j=1; j<=16; j++)  {
            System.out.print(" ");
        }
        System.out.print("\\-/");
        System.out.println();
    }
    
    public static void nose()  {
        {
        for(int i=1; i<=16; i++)  {
            System.out.print(" ");
        }
        System.out.print("|-|");
    }
    for(int j=1; j<=10; j++)  {
        System.out.print(" ");
    }
    System.out.println();
}
public static void writeChars(char ch, int number)  {
    for(int i=1; i<=number; i++)  {
        System.out.print(ch);
    }
}

public static void mouth()  {
    for(int i=1; i<=21; i++)  {
        writeChars('<', i);
        writeChars(' ', 42-2*i);
        writeChars('>', i);
        System.out.println();
    }
}

//maketeeth
public static void teeth()  {
    for(int i=1; i<=17; i++)  {
        System.out.print(" ");
    }
    System.out.print("|_|_|");
    System.out.println();
}
//makelegs
public static void legs()  {
    for(int i=1; i<=10; i++) {
        System.out.print(" ");
    }
    System.out.print("|    |");
    for(int j=1; j<=4; j++)  {
        System.out.print(" ");
    }
    System.out.print("|    |");
    System.out.println();
}

//feet
public static void feet()  {
    {
    for( int i=1; i<=10; i++)  {
        System.out.print(" ");
    }
    System.out.print("|===|");
}
for(int i=1; i<=6; i++)  {
    System.out.print(" ");
}
System.out.print("|===|");
System.out.println();
}

public static void holes()  {
    {
    for( int i=1; i<=3; i++)  {
        System.out.print(" ");
    }
    System.out.print("o");
    System.out.print("         o         o          o");
}
System.out.println();
}


  

  
    
    public static void main(String[] args)  {
        topofhead();
        doublesideface();
        doublesideface();
        holes();
        eyes();
        eyesbottom();
        holes();
        nose();
        doublesideface();
        doublesideface();
        holes();
        holes();
        holes();
        doublesideface();
        mouth();
        teeth();
        doublesideface();
        topofhead();
        doublesideface();
        holes();
        doublesideface();
        topofhead();
        legs();
        legs();
        legs();
        feet();
        
    }
}


