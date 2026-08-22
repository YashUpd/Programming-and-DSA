import java.util.*;
public class Pattern5 {
  public static void main(String ar[]){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the number of rows:");
    int n = in.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
