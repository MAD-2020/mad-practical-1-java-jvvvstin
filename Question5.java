import java.util.Scanner;

public class Question5
{
  public static int getMode(int[] numArray) {
    int count = 0;
    int tempCount;
    int tempMode;
    int actualMode = numArray[0];
    for (int i : numArray) {
      tempMode = i;
      tempCount = 0;
      for (int n : numArray) {
        if (tempMode == n) {
          tempCount++;
        }
      }
      if (tempCount > count) {
        count = tempCount;
        actualMode = tempMode;
      }
    }
    return actualMode;
  }
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter in number of inputs: ");
    int noOfInputs = in.nextInt();
    int[] intArray = new int[noOfInputs];
    for (int i = 0; i < noOfInputs; i++) {
      //System.out.printf("Enter a number (%d): ", i+1);
      intArray[i] = in.nextInt();
    }
    System.out.println("The mode is " + getMode(intArray));
    
  }
}
