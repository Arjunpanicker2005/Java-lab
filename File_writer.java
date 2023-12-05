import java.io.*;
import java.util.*;
class File_writer{
       public static void main(String Args[]){
                      try{
                             FileWriter f1= new FileWriter("file2.txt");
                             f1.write("this is the first time using the write function");
                             f1.close();
                             System.out.println("the writing is successful\n");
                      }catch(Exception e){
                              System.out.println("an error occurred\n");
                      }
       }
}