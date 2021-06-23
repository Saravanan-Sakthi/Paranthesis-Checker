package string;
import string.ParanthesisChecker;
import java.util.Scanner;
class TestPC{
  public static void main(String []abc){
    Scanner S= new Scanner(System.in);
    System.out.print("Input : ");
    String in=S.next();
    new ParanthesisChecker().check(in);
  }
}