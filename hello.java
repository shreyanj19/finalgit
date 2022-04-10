import java.util.Scanner;
class hello{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c  = a+b;
        System.out.println("sum = "+ c);
    }
}
