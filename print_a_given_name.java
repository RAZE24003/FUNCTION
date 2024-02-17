import java.util.Scanner;

public class print_a_given_name {
    public  static void printMyName(String name){
        System.out.println(name);
         return;
    }
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner sc=new Scanner(System.in);   
        String name=sc.nextLine();  
        printMyName(name);   
    }
    
}