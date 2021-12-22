import java.util.Scanner;

public class q_1008 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first_num = 0;
        double second_num = 0;

        first_num = sc.nextDouble();
        second_num = sc.nextDouble();

        sc.close();

        System.out.print(first_num / second_num);

    }

}