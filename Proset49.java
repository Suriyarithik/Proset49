# Proset49
import java.util.*;
public class proset49 {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int uppered=in.nextInt();
    int lowerED=in.nextInt();
    int sUM=0,s1=0;
    for(int i=1;i<uppered;i++)
    {
      sUM=sUM+i;
    }
    for(int i=1;i<lowerED;i++)
    {
      s1=s1+(i*sUM);
    }
    System.out.print(s1);
    

  }

}
