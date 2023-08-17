
public class OperBit3_3 {

   public static void main(String[] args) {
      int x=0b1011001;
      int n=0; //byte index
      while (x!=0) { //status check of last byte
         if ((x&1)!=0) {
            System.out.println(n+"flag on");
         }
         else {
            System.out.println(n+"flag off");
         }
         x=x>>>1; //move to right 1 position
         n++;
         
      }
      

   }

}
