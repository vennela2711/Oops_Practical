package CSE;

class Boxnew {  
    double width;    
    double height;  
    double depth; 
   
    Boxnew() {
        System.out.println("Constructing Box"); 
        width = 10;
        height = 10; 
        depth = 10;
    }
  
    double volume() {
        return width * height * depth;
    }
}

public class defaultconstructors
{ 
    public static void main(String args[]) { 
        // declare, allocate, and initialize Boxnew objects 
        Boxnew mybox1 = new Boxnew();
        Boxnew mybox2 = new Boxnew(); 
        double vol; 

        // get volume of first box 
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println("Volume is " + vol); 
    }
}