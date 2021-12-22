import java.util.Scanner;

public class q_2588 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_num = 0;
        int second_num = 0;
        int sum = 0;
        int i = 0;

        first_num = sc.nextInt();
        second_num = sc.nextInt();

        sum = first_num * second_num;

        sc.close();

        for(i=0; i<=2; i++) {
            System.out.println(first_num * (second_num % 10));
            second_num /= 10;
        }

        System.out.println(sum);

    }

}