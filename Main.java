import java.util.Scanner;
import lib.*;
public class Main {
    public static void main(String[] args){
        int select;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Select choice in Test 1.JAGED 2.ARRAYLIST 3.TO EXIT : ");
        select=sc.nextInt();
        switch (select) {
        case 1:
            JAGGED.exam1();
            break;
        case 2:
            DATA.exam2();
            break; 
       }
      }while(select!=3);
    }
}