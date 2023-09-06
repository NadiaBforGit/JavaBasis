import java.util.Arrays;

public class Arr5_4 {

   public static void main(String[] args) {
      int[] arr = new int[] {1,2,3,4,5};
      for (int v: arr) {
         v += 10;
         System.out.println(v+" ");
      }
      for (int v: arr) {
         System.out.println(v+" ");
      }

      // multidimentional array
      int[] [] arr1 = new int [2] [4];
      System.out.println(Arrays.deepToString(arr1));
      
      int[] [] arr2 = new int [] [] {
            {1,2,3,4},
            {5,6,7}
      };
      System.out.println(Arrays.deepToString(arr2));
      
   }

}
