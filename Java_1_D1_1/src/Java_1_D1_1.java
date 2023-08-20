
public class Java_1_D1_1 {
   static long factorial(int n) {
      //?? 0 <= n <=20 long limit
      long res=1;
      for (int i=2; i<=n; ++i) res=res*i;
       return res;
   }
   
   public static void main(String[] args) {
      // screenshot
      System.out.println(factorial(5));

   }

}
