import java.util.Scanner;
public class DW {
    public static void main (String[]args){
        try(Scanner input= new Scanner(System.in)){
           System.out.println("Enter Your NUmber=");
            int i= input.nextInt();
            do{
                System.out.println("Number is "+i);
                i++;
            }while(i<=20);
        }
    }
    
}
