import java.util.Scanner;

public class Question4
{
  public static void stringMultiply(String s, int n) {
    for(int i = n; i > 0; i--) {
      System.out.print(s);
    }
  }
  
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter a number: ");
    int num = in.nextInt();
    for (int i = 0; i < num; i++) {
      stringMultiply("*", num - i);
      System.out.print("\n");
    }
  }
}
