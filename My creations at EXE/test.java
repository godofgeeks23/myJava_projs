import java. util. Scanner;
class Main
{
  public static void main (String args[]) 
   {
      char ch;
      int s, l, b; 
      double r, peri;
      Scanner sc = new Scanner (System.in);
       System. out. println ("MENU FOR PERIMETER");
       System. out. println ("Press 'a' to calculate perimeter of square");
       System. out. println ("Press 'b' for perimeter of rectangle ");
       System. out. println ("Press 'c' for perimeter of circle");
       System. out. println(" ENTER YOUR CHOICE") ;
       ch = sc.next().charAt(0);
           switch (ch){
           case 'a' : System. out. println ("Enter the side");
            s= sc. nextInt();
            peri= 4*s;
            System. out. println ("The side is " + s);
            System. out. println ("The Perimeter is " +  peri );
            break;
            case 'b' : System. out. println ("Enter the length");
            l= sc. nextInt();
                System. out. println("Enter the breadth");
            b= sc. nextInt();
            peri= 2* (l + b);
            System. out. println ("The length is " + l);
            System. out. println ( " The breadth is" + b);
            System. out. println ("The Perimeter is " +  peri );
             break;
             case 'c' : System. out. println ("Enter the radius");
            r= sc. nextDouble();
            peri= 3.14*r*r;
            System. out. println ("The radius " + r);
            System. out. println ("The Perimeter is " +  peri );
            break;
            default: System.out.println("Invalid choice");
            }
        }
     }