package lib;
import java.util.Scanner;
public class JAGGED{
    public static void exam1(){
        while (true) {
             try{
                Scanner sc= new Scanner(System.in);
             int num,count=1,d=0;
             System.out.print("Input number : "); num=sc.nextInt(); //ตรงนี้ใช้เป็น nextLine() ได้แต่ต้องแปลงเป็น int ด้วย Integer.parseInt()
             int[][] numOUT = new int[num][]; 
             
            for(int i=0;i<num;i++){      //ต้องกำหนดขนาดของ colum ก่อน 
                numOUT[i]=new int[num-d];
                d++;
            }
           
            d=0;
             for(int i=0;i<num;i++){      //เมื่อกำหนดขนาด colum แล้วจึงสามารถกำหนดค่าของสนมาชิกในแต่ละ colum ได้
                for(int j=0;j<num-d;j++){
                    numOUT[i][j]=count;
                    System.out.print(numOUT[i][j]+" ");
                    count++;
                }
                System.out.println(" ");
                d++;
             }
             break;
            }
            catch(Exception e){
                System.out.println(e+" Must be Integer!!!");
            }
        }
         
    }
}