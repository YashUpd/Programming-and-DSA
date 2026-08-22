import java.util.*;
public class Conditional1 {
  public static void main(String ar[]){
    Scanner in = new Scanner (System.in);
    int age = in.nextInt();
    if(age>=18){
      System.out.println("You are eligible to vote");
    } else{
      System.out.println("You are not eligible to vote");
    }
  }
}
