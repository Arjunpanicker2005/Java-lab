import java.io.*;
import java.util.*;
class file_create{
       public static void main(String Args[]){
            try{
                   File f1=new File(("file2.txt"));
                   if(f1.createNewFile()){
                        System.out.println("file is created\n");
                        
                   }
                   else{
                      System.out.println("file is not created\n");
                   }
}
catch(Exception e){
     System.out.println("an error has occured\n");
         
}
       }
    }