
public class Oper3_1 {

   public static void main(String[] args) {
      int x=0, y=0;
      x=5;
      y=x++;
      System.out.println("post x="+x+", y="+y);
      x=5;
      y=++x;
      System.out.println("pre x="+x+", y="+y);

   }

}
