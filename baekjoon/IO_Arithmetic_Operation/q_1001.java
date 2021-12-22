import java.util.Scanner;

public class q_1001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_num = 0;
        int second_num = 0;

        first_num = sc.nextInt();
        second_num = sc.nextInt();

        sc.close();

        System.out.print(first_num - second_num);

    }

}
