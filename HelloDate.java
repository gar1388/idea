import java.util.*;

public class HelloDate {
  public static void main(String[] args) {
    System.out.println("Hello, it's: ");
    System.out.println(new Date());
    MyFirstClass c1 = new MyFirstClass();
    c1.x=10;
    System.out.println(c1.x);
  }
}

class MyFirstClass{
 public int x;
}
