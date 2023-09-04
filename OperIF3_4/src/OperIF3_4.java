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
      
      //перебор элементов массива. Нумерация и вывод в прямом и обратном порядке
      int[] arr1 = new int[5];
      // нумеруем элементы массива
      for (int i=0, j=1; i<arr1.length; i++, j++) {
         arr1[i]=j;
      }
      // выводим значения в прямом порядке
      for (i=0; i<arr1.length; i++) {
         System.out.println(arr1[i]+" ");
      }
      System.out.println("-----------------");
      // выводим значения в обратном порядке
      for (i=arr1.length-1; i>=0; i--) {
         System.out.println(arr1[i]+" ");
      }
   }
   
   //передача анонимного массива в качестве параметра ч.2
public static void printArr(int[] a) {
   for (int i: a) {
      System.out.println(i);
   }
}

   
   
}
