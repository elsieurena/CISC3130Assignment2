
package merge;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Merge {
   public static void mergeArrays(int[] arr1, int[] arr2, int n1, 
                                int n2, int[] arr3) { 
        int i = 0, j = 0, k = 0; 
        // Traverse both array 
        while (i<n1 && j <n2) { 
            // Check if current element of first 
            // array is smaller than current element 
            // of second array. If yes, store first 
            // array element and increment first array 
            // index. Otherwise do same with second array 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; } 
        // Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = arr2[j++]; } 
    
  // Sample input
  public static int[] input1 = {1,3,5};
  public static int n1 = input1.length; 
  public static int[] input2 = {2,4,5,6};
  public static int n2 = input2.length; 
  public static int[] output2 = new int[n1+n2];
  public static void main(String[] args){
    // Display Input1
    System.out.println("Input1:\t" + Arrays.toString(input1));
    //Display Input2
    System.out.println("Input2:\t" + Arrays.toString(input2));
    // Create empty queues
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    Queue<Integer> queue3 = new LinkedList<Integer>();
    for(int i=0; i<input1.length; i++){
      // One by one push all characters of string to queue.
      queue1.add(input1[i]);
    }
    for(int j=0; j<input2.length; j++){
      // One by one push all characters of string to queue.
      queue2.add(input2[j]);
    }
    mergeArrays(input1, input2, n1, n2, output2);
    // One by one push all characters of string to queue.
    for (int l=0; l < n1+n2; l++)
       queue3.add(output2[l]);
    // Save the input string
    String output = "";
    while(queue1.peek() != null ){
      //One by one pop all characters from stack and put them back to string.
      output += Integer.toString(queue1.poll());
    }
    while(queue2.peek() != null ){
      //One by one pop all characters from stack and put them back to string.
      output += Integer.toString(queue2.poll());
    }
    String output3 = "";
    while(queue3.peek() != null ){
      //One by one pop all characters from stack and put them back to string.
      output3 += Integer.toString(queue3.poll());
    }
    // Display reversed as string array
    System.out.println("Output not sorted: " + Arrays.toString(output.split("")));
      //Prints the numbers sorted 
      System.out.println("Output sorted: " + Arrays.toString(output3.split("")));
      System.out.println();
  }
}

