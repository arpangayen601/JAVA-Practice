import java.util.Scanner;

public class inputSc {
    public static void main(String[]args){
        System.out.println("Write");
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Roll Num is ="+input.nextInt());

            
        } 
    }
}
