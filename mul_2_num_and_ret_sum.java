import java.util.Scanner;

public class mul_2_num_and_ret_sum {
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("the sum  is " + mul(a, b));
    }
}
