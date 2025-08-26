package CSE;

public class Stringbuilder {
 public static void main(String[]args) {
 StringBuilder sb = new StringBuilder("Hello");

   
    sb.append(" World");
    System.out.println("After append: " + sb); 
    
    sb.insert(5, ", Java");
    System.out.println("After insert: " + sb); 

    
    sb.replace(7, 11, "Parallel");
    System.out.println("After replace: " + sb); 
    
    sb.delete(6, 13);
    System.out.println("After delete: " + sb);

   
    sb.deleteCharAt(5);
    System.out.println("After deleteCharAt: " + sb); 

    
    sb.reverse();
    System.out.println("After reverse: " + sb);

    
    char ch = sb.charAt(3);
    System.out.println("Character at index 3: " + ch); 

    
    sb.setCharAt(3, 'X');
    System.out.println("After setCharAt: " + sb); 

    
    System.out.println("Length: " + sb.length()); 

    
    System.out.println("Capacity: " + sb.capacity());

    
    sb.ensureCapacity(50);
    System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

    
    String sub1 = sb.substring(3);
    System.out.println("Substring from index 3: " + sub1); 

    
    String sub2 = sb.substring(3, 7);
    System.out.println("Substring from index 3 to 7: " + sub2); 

    
    sb.setLength(5);
    System.out.println("After setLength(5): " + sb);

    String result = sb.toString();
    System.out.println("Converted to String: " + result);
}
}