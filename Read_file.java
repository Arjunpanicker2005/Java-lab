import java.io.*;
import java.util.*;
class Read_file{
        
         public static void main(String Args[]){
               try{
              File f1= new File("File2.txt");
              Scanner r1= new Scanner(f1);
              while(r1.hasNextLine()){
                     String data=r1.nextLine();
                     System.out.println(data);
              }
         }catch(Exception e){
                System.out.println("an error has occured\n");
         }
        
   }
}