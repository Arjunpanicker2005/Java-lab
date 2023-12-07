import java.io.*;
import java.util.*;
class StringTokenizerDemo{
    public static void main(String Args[]){
          String data;
          System.out.println("enter the string\n");
          Scanner sc=new Scanner(System.in);
          data=sc.nextLine();
          StringTokenizer str=new StringTokenizer(data);
          while(str.hasMoreTokens()){
                   System.out.println(str.nextToken());
                   }
            }
          }
