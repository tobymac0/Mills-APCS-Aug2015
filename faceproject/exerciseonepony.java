
/**
 * my little pony project 
 * Tobias Jeung  
 * 
 */
public class exerciseonepony {
    //exerciseone generate distances from each pair of coordinates 
    public static void getdistances(){
    
        System.out.println("Distance from Baltimare + Manehattan is " + distance(MANHATTANX1,MANHATTANX2,MANHATTANX3,MANHATTANX4));
        System.out.println("Distance from Los Pegasus to Neighagra Falls is " + distance(LOSPEGASUSX1,LOSPEGASUSX2,LOSPEGASUSX3,LOSPEGASUSX4)); 
        System.out.println("Distance from the Badlands to Ponyville is " + distance(BADLANDSX1,BADLANDSX2,BADLANDSX3,BADLANDSX4));
    }


    public double distance(int x1, int x2, int y1, int y2)  {
        double distance = Math.sqrt(Math.pow((x2-x1),2 + Math.pow((y2-y1),2)));
        return distance;
    }

  
    //exercisetwo finding circumfrence
    public double roadTrip(double diameter)  {
        double length = diameter*Math.PI; 
        return length;
    }

    //exercisethree output distance between the three destinations and angles between each pair of coordinates
    public static void threedistance()  {
        angle C = acos(b*b) + (c*c) - (a*a))/2*b*c)));
        int a = 20;
        int b = 30;
        int c = 40;
    }

    
    //exercisefour returns longest distance between any pair of destinations 
    // execute public double distance return distance from los pegasus to Neighagra galls
    public double threedistance(int x1, int x2, int x3, int y1, int y2, int y3)  {
        double three distance = Math.sqrt(Math.pow((x2-x1),2 + Math.pow((y2-y1,2));
        return distance;
    }

    public static void main(String[] args)  {
         public static final int MANHATTANX1 = 31;
        public static final int MANHATTANX2 = 34;
        public static final int MANHATTANX3 = -16;
        public static final int MANHATTANX4 = -19;
        public static final int LOSPEGASUSX1 = 7;
        public static final int LOSPEGASUSX2 = 22;
        public static final int LOSPEGASUSX3 = -19;
        public static final int LOSPEGASUSX4 = -8;
        public static final int BADLANDSX1 = 25;
        public static final int BADLANDSX2 = -16;
        public static final int BADLANDSX3 = -23;
        public static final int BADLANDSX4 = -14;
        getdistances();
    }
}

    
