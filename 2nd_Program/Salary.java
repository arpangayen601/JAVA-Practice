import java.util.Scanner;

public class Salary {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Enter Your Salary");
            int Salary = input.nextInt();
            if(Salary>10000){
              Salary= Salary+2000;  
            }
            else{
                Salary=Salary+1000;
            }

            System.out.println("Salary is "+Salary);
        }
       
    }
    
}
