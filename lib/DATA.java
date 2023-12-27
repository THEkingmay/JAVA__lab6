package lib;
import java.util.ArrayList;
import java.util.Scanner;
public class DATA {
    private static ArrayList<String>A=new ArrayList<>();

    static String Call_Text(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input text : ");
        String text=sc.nextLine();
        return text;
    }
    static int Call_Index(){

        Scanner sc=new Scanner(System.in);
        System.out.print("Input index : ");
        int index=sc.nextInt();
        return index;
    }
    static void Show(){
        System.out.print("DATA = ");
        for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+" ");
        }
        System.out.println(" ");
    }
   
    static void addText(int b){
        String text=Call_Text();
        A.add(b,text);
        Show();
    }
    static void addText_index(){
       int index=Call_Index();
       addText(index);
    }
    
    static void Edit(){
        int index=Call_Index();
        String text = Call_Text();
        A.set(index, text);
        Show();
    }
    
    static void Remove_index(){
        int index = Call_Index();
        A.remove(index);
        Show();
    }
    static void Remove_value(){
        String text=Call_Text();
        A.remove(text);
        Show();
    }

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
         try{
            do{
            System.out.print("\nSelect--> "); select=sc.nextInt();
            switch (select) {
            case 1:
            System.out.println("== Add text to back ==");
            addText(A.size());
            break;
            case 2:
            System.out.println("== Add text by index ==");
            addText_index();
            break;
            case 3:
            System.out.println("== Edit text ==");
            Edit();
            break;
            case 4:
            System.out.println("== Remove text by index ==");
            Remove_index();
            break;
            case 5:
            System.out.println("== Remove text by value ==");
            Remove_value();
            break;
            case 6:
            System.out.println("Good Bye !");
            break;
            default: 
            System.out.println("Wrong input !! ");
        }
       }while(select!=6);
    }catch(Exception e){
            System.out.println(e+" For input string : ");
            Show();

    }
    //      switch (select) {
    //         case 1:
    //         System.out.println("== Add text to back ==");
    //         addText(A.size());
    //         break;
    //         case 2:
    //         System.out.println("== Add text by index ==");
    //         addText_index();
    //         break;
    //         case 3:
    //         System.out.println("== Edit text ==");
    //         Edit();
    //         break;
    //         case 4:
    //         System.out.println("== Remove text by index ==");
    //         Remove_index();
    //         break;
    //         case 5:
    //         System.out.println("== Remove text by value ==");
    //         Remove_value();
    //         break;
    //         case 6:
    //         System.out.println("Good Bye !");
    //         break;
    //         default: 
    //         System.out.println("Wrong input !! ");
        
    //     }
    //   }while(select!=6);

    }
}
