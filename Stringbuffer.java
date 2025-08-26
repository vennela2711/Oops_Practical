package CSE;

public class Stringbuffer {
	public static void main(String[]args) {
 StringBuffer sb = new StringBuffer("Hello");
 sb.append(" World");
    System.out.println("After append: " + sb); 

    
    sb.insert(5, ", Pretty");
    System.out.println("After insert: " + sb); 

   
    sb.replace(6, 1, " Dream");
    System.out.println("After replace: " + sb); 

   
    sb.delete(5, 15);
    System.out.println("After delete: " + sb);
   
    sb.reverse();
    System.out.println("After reverse: " + sb); 
   
    char ch = sb.charAt(4);
    System.out.println("Character at index 4: " + ch);

    
    sb.setCharAt(4, 'X');
    System.out.println("After setCharAt: " + sb); 
    
    int len = sb.length();
    System.out.println("Length: " + len); 

    
    int cap = sb.capacity();
    System.out.println("Capacity: " + cap); 
   
    String str = sb.toString();
    System.out.println("Converted to String: " + str);
}

}











































































































































































































