import java.util.Scanner;
public class add_2_num_and_return_sum {
    public static int addTwoNum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int sum= addTwoNum(a, b);
        System.out.println("the sum is " + sum);
    }
}
