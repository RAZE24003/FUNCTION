import java.util.Scanner;

public class factorialof_a_num {
    public static int factorial(int n)
    {
        if(n<0)
        {
            System.out.println("invalid number");
            return 0;
        }
        int sum=1;

        for(int i=n;i>=1;i--)
        {
            sum=sum*i;
        }
         System.out.print(sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);

    }
    
}
