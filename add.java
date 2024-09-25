import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value:");
    int a= scanner.nextInt();
    int b= scanner.nextInt();
    int c= scanner.nextInt();
    int d=a+b+c;
      System.out.println("Sum of the values:"+d);
      System.out.print("Divided the value:");
    int h=scanner.nextInt();
    int y=d/h;
     System.out.print("Divide of the values:"+y);
}
}
