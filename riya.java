import java.util.Scanner;
class riya
{  
  public static void main(String args[])
  {  
    int n;
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n= sc.nextInt();
    if (n%10==7 || n%7==0)
   System.out.println(n+" is a buzz number");
   else
   System.out.println(n+" is not a buzz number");
   }
}