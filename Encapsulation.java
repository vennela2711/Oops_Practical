package CSE;


 class Programmer {
     private String name;
   public String getName() { return name; }
   public void setName(String name) { this.name = name; }
 }
 public class Encapsulation {
 public static void main(String[] args) {
         Programmer p = new Programmer();
         p.setName("Geek"); 
         System.out.println("Name=> " + p.getName());
     }
 }
