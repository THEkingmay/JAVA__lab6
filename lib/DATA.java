package lib;
import java.util.Scanner;
public class DATA {
    public static void exam2(){
        Scanner sc=new Scanner(System.in);
        int select;
        System.out.println("==== MENU ====");
        System.out.println("1) Add Text to back");
        System.out.println("2) Add Text at index");
        System.out.println("3) Edit text");
        System.out.println("4) Remove Text by index");
        System.out.println("5) Remove Text by value");
        System.out.println("6) Exit");
      do{
         System.out.print("Select--> "); select=sc.nextInt();
         switch (select) {
            case 1:
                
                break;
         
            default:
                break;
         }
      }while(select!=6);
    }
}
