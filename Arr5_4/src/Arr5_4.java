
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

   }

}
