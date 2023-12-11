import java.util.*;
abstract class shape{
       abstract void numberofsides();
}
class triangle extends shape{
         void numberofsides(){
                    System.out.println("the number of sides of triangle is 3\n");
         }
}
class Rectangle extends shape{
          void numberofsides(){
          System.out.println("the number of sides of rectangle is 4\n");
}
}
class hexagon extends shape{
          void numberofsides(){
                System.out.println("the number of sides of hexagon is 6\n");
          }
}
class Shapetest{
        public static void main(String Args[]){
                  triangle t=new triangle();
                  Rectangle r=new Rectangle();
                  hexagon h=new hexagon();
                  t.numberofsides();
                  r.numberofsides();
                  h.numberofsides();
        }
}
