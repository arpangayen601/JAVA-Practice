import java.util.Scanner;

public class SalaryMethod {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Enter Your Salary");
            int Salary = input.nextInt();
            if(Salary>40000){
              Salary= Salary+4000;  
            }
           else if(Salary<=25000){
            Salary+=3000;
           }
            else {
                Salary+=1000;
            }

            System.out.println("Salary is "+Salary);
        }
       
    }
    
}
