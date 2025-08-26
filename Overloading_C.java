package CSE;
class BoxOver
 { 
   double width;
   double height; 
   double depth; 

 // constructor used when all dimensions specified 
   BoxOver(double w, double h, double d) 
   {
  width = w;
  height = h; 
  depth = d;
    } 
// constructor used when no dimensions specified 
BoxOver() 
 {
   width = -1;  // use -1 to indicate 
   height = -1; // an uninitialized 
   depth = -1; // box
  } 

// constructor used when cube is created 
     BoxOver(double len) 
{
 width = height = depth = len;
 } 

// compute and return volume 
double volume() 
  {
   return width * height * depth;
  }
 } 
class Overloading_C
{
 public static void main(String args[]) 
{ 
    // create boxes using the various constructors
    BoxOver mybox1 = new BoxOver(10, 20, 15); 
    BoxOver mybox2 = new BoxOver(); 
    BoxOver mycube = new BoxOver(7); 
    double vol; 

    // get volume of first box
    vol = mybox1.volume();
    System.out.println("Volume of mybox1 is " + vol); 

   // get volume of second box
   vol = mybox2.volume(); 
   System.out.println("Volume of mybox2 is " + vol); 

  // get volume of cube 
  vol = mycube.volume();
   System.out.println("Volume of mycube is " + vol); 
}
 }