
package cst250ass3b;
import    java.util.Stack;
public class CST250Ass3b {

    
    public static void main(String[] args) {
      
        Stack<Character> stack = new Stack<>();
        
        String text = "madam";
        
        for (Character c : text.toCharArray()) {
            stack.push(c);
           
        }
        
        String text2 = " ";
        
        while (stack.size() > 0) {
            text2 += stack.pop();
        }
        
        if(text.equals(text2)) {
            System.out.println("False");
            
        } else
        {
        System.out.println("True");
        
        } 
    }
    
}
