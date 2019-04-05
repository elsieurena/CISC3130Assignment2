
package palindrome;
import java.util.Arrays;
import java.util.Stack;
public class Palindrome {
  // Sample input
  public static int[] input = {1,2,3,2,1};
  public static char[] input2 = {'r','a','c','e','c','a','r'};
  public static void main(String[] args){
    // Display Input
    System.out.println("Input:\t" + Arrays.toString(input));
    String word1="";
    String word="";
    // Create an empty stack
    Stack<Integer> stack = new Stack<Integer>();
    //Creates an empty stack for input2
    Stack<Character> stack2 = new Stack<Character>();
    for(int i=0; i<input.length; i++){
       word+=Integer.toString(input[i]);
      // One by one push all characters of string to stack.
      stack.push(input[i]);
    }
    //This is for Input2 
     for(int j=0; j<input2.length; j++){
       word1 +=Character.toString(input2[j]);
      // One by one push all characters of string to stack.
      stack2.push(input2[j]);
    }
    // Save the reversed input string
    String reversed = "";
    while(!stack.empty()){
      //One by one pop all characters from stack and put them back to string.
      reversed += Integer.toString(stack.pop());
    }
    //This is for input2
    String reverse = "";
    while(!stack2.empty()){
      //One by one pop all characters from stack and put them back to string.
      reverse += Character.toString(stack2.pop());
    }
    // Display reversed as string array
    System.out.println("Output:\t" + Arrays.toString(reversed.split("")));
    System.out.println(Palindrome2(word,reversed));
    System.out.println("Input:\t" + Arrays.toString(input2));
    System.out.println("Output:\t" + Arrays.toString(reverse.split("")));
    System.out.println(Palindrome2(word1,reverse));
  } // end main
  public static boolean Palindrome2(String word, String reversed){
     if(word.equals(reversed)){
   return true;
  }else{
     return false;
     }
  }
}// end class Palindrome