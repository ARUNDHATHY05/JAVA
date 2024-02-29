import java.util.Scanner;
class ScannerDemo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("first number: ");
int a=s.nextInt();
System.out.println("second number: ");
int b=s.nextInt();
System.out.println("sum="+(a+b));
}
}
