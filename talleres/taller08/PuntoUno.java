import java.util.*;

public class PuntoUno {

    public static void main(String[] args) {
	System.out.println(NotacionPolaca("6 5 - 4 +"));
        System.out.println(NotacionPolaca("3 5 * 2 +"));
        System.out.println(NotacionPolaca("10 2 /"));

    }

    
    public static int NotacionPolaca  (String string){
        String[] s = string.split(" ");
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<s.length;i++){
            if(s[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(s[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(s[i].equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }
            else if(s[i].equals("/")){
                stack.push(stack.pop()/stack.pop());
            }
            else{
                stack.push(Integer.parseInt(s[i]));
            }
        }
        return stack.pop();
    }

   
}