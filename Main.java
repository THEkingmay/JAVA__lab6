import java.util.Scanner;
import lib.*;
public class Main {
    public static void main(String[] args){
        int select;
        Scanner sc=new Scanner(System.in);
         System.out.print("Select choice : ");
        select=sc.nextInt();
       switch (select) {
        case 1:
            JAGGED.exam1();
            break;
       
        case 2:
            DATA.exam2();
            break; 
       }

    }
}