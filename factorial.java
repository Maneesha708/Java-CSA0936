import java.util.Scanner;
class Factorial{
    public static void main(String a[]){
      int fact=1;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=s.nextInt();

      for(int i=1;i<=n;i++){
        fact=fact*i;
      }
      System.out.println(fact);
    }
}