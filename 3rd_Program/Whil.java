import java.util.Scanner;
public class Whil {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Enter Your Number");
            int i=input.nextInt();
            while(i<20){
                System.out.println("Number IS "+i);
                i++;
            }
        }
    }
    
}
