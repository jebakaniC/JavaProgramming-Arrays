import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int numberOfPin, pinNumber, count;
    System.out.println("Enter the total number of PIN numbers: ");
    numberOfPin = sc.nextInt();
    
    if (numberOfPin > 0) {
        int[] arr = new int[numberOfPin];
      
        System.out.println("Enter the PIN numbers");
        for (int i = 0; i < numberOfPin; i++) {
          arr[i] = sc.nextInt();
          if (arr[i] > 0) {
            pinNumber = arr[i];
            count = 0;
            while (pinNumber != 0){
              pinNumber /= 10;
              ++count;
            }
            if (count < 4 || count > 4) {
              System.out.println(arr[i]+" is an invalid PIN number");
              System.exit(0);
            }
          }
          else {
            System.exit(0);
          }
        }
    }
  }
}
      
      
