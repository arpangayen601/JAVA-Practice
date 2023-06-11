import java.util.Scanner;
public class Fun {
    public static void main(String[]args){
       Sum();
        Arp();        
    }
    static int Sum(){
        try(Scanner in =new Scanner(System.in)){
        System.out.println("Enter 1St number ");
        int num1=in.nextInt();
        
        System.out.println("Enter 2nd NUmber ");
        int num2=in.nextInt();
                   
        int sum=num1+num2;
        System.out.println("Sum is = "+sum);
        }
        return 0;
    }
    static void Arp(){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter Your Name ");
            String i=in.next();

            System.out.println("Hello " + i);
        }
        
    }
    
}
