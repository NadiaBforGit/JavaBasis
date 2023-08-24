import java.util.Scanner;
// check odd-even number
public class OperIF3_4 {

   public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int x=0;
      System.out.println("enter Integer");
      x=in.nextInt();
      if (x%2==0) {
         System.out.println(x+" even number");
      }
      else {
         System.out.println(x+" odd number");         
      }

            
      
   }

}
