import java.util.Scanner;
public class Datatype {
    public static void main(String[]args){
        System.out.println("Write Data type");
        try(Scanner input =new Scanner(System.in)){
            System.out.println("Data Type is Int="+input.nextInt());
            System.out.println("Write Data type");
            System.out.println("Data Type is Float="+input.nextFloat());
            System.out.println("Write Data type");
            System.out.println("Data Type is Double="+input.nextDouble());
            System.out.println("Write Data type");
            System.out.println("Data Type is Long="+input.nextLong());
            System.out.println("Write Data type");
            System.out.println("Data Type is String ="+input.next());
        }
    }
    
}
