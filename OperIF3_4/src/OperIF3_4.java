import java.util.Scanner;

// check odd-even number
public class OperIF3_4 {

   public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int x=0;
      System.out.print("enter Integer ");
      x=in.nextInt();
      if (x%2==0) {
         System.out.println(x+" even number");
      }
      else {
         System.out.println(x+" odd number");         
      }        

      //передача анонимного массива в качестве параметра ч.1
      int[] arr= {10,20,30};
      printArr(arr);
      printArr(new int[] {40,50,60});
      
   }
   
   //передача анонимного массива в качестве параметра ч.2
public static void printArr(int[] a) {
   for (int i: a) {
      System.out.println(i);
   }
}

   
   
}
