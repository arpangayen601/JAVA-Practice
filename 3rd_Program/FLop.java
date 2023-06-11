import java.util.Scanner;

public class FLop {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter NUM = ");
            int i= input.nextInt();
            for (;i < 10; i++) {
                System.out.println("NUM = "+i);
            }
        }
    }
}
