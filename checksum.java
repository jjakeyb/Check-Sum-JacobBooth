import java.util.Scanner;

class checksum  
{  

  public static void main(String args[]) {

    final int max_int = 255;  // The maximum size for the input
    int count = 10;           // The number of integers to read from stdin
    int value = 0;            // The value just read from stdin:  value = stdin.nextInt();
    int sum = 0;              // Note that the "sum" might exceed max_int
    int checksum = 0;         // The value of the 6th input integer
    int quotient;             // The result of evaluating the assignment: quotient   = sum / (max_int + 1);
    int remainder;            // The result of evaluating the assignment: remainder  = sum % (max_int + 1 );
    int complement;           // The result of evaluating the assignment: complement = max_int - sum;

    Scanner stdin = new Scanner(System.in);
    
    value = stdin.nextInt();