
public class Oper3_1 {

   public static void main(String[] args) {
      int x=0, y=0;
      x=5;
      y=x++;
      System.out.println("post x="+x+", y="+y);
      x=5;
      y=++x;
      System.out.println("pre x="+x+", y="+y);
      
      System.out.println(" ");
      
      int w=232;
      System.out.println(Integer.toBinaryString(w));
      System.out.println(Integer.toBinaryString(~w));
      
      int a=5, b=0;
      b=++a + ++a + ++b;
      System.out.println(a + " " + b);
      
      System.out.println(10%6);
      System.out.println(10%4);
      System.out.println(0.0/0);
      System.out.println(10.0/0);
      System.out.println(-10.0/0);
      
      
      

   }

}
