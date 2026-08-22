import java.util.*;
public class Pattern2 {
  public static void main(String ar[]){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the number of rows and columns:");
    int n = in.nextInt();
    int m = in.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(i==1 || i==n || j==1 || j==m){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
