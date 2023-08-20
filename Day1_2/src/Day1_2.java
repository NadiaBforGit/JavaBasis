import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Day1_2 {

   public static void main(String[] args) {
      int data[];
      data = new int[7];
      data[0]=23;
      System.out.println(data[0]);// обратиться к любому элемента массива по порадковому номеру
      System.out.println(data.length);
      
      int data2[] = {3,1,6,-2,9,0,3,-6,8};
      //печать массива дата2
      for (int i=0; i<data2.length; ++i)
         System.out.print(" "+data2[i]);
      
      System.out.println(" ");
      //find maximum
      int max=data2[0];
      for (int item: data2)
         if (item>max) max=item;
      System.out.println("max="+max);
      
      String name="Alex";
      String name2= new String("Alex");
      // System.out.println(name==name2); return false as == here works incorrectly due to difficault object
      System.out.println(name.equals(name2));
      

      String s[ ]={"cobol","java","c++","basic","javaScript","ada"};
      Pattern p = Pattern.compile ("^j.+");
      
      for ( var item : s )
                  if (p.matcher(item).matches ( )) 
                           System.out.println(item);

   }

}
