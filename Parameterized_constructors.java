package CSE;
class BoxNew
{  
  double width;
  double height;
  double depth;

BoxNew(double w, double h, double d) 
   {   
  width = w; height = h; depth = d;
   }

double volume()
  { 
  return width * height * depth;
   }
}
class Parameterized_constructors
{
public static void main(String args[]) 
 { 
   // declare, allocate, and initialize Box objects
  BoxNew mybox1 = new BoxNew(10, 20, 15); 
  BoxNew mybox2 = new BoxNew(3, 6, 9); 
  double vol; 
  
  // get volume of first box 
  vol = mybox1.volume(); 
  System.out.println("Volume is " + vol);
  
   // get volume of second box 
  vol = mybox2.volume(); 
  System.out.println("Volume is " + vol);
}
}