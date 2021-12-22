import java.util.Scanner;

public class q_10430 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_num = 0;
        int second_num = 0;
        int third_num = 0;

        first_num = sc.nextInt();
        second_num = sc.nextInt();
        third_num = sc.nextInt();

        sc.close();

        System.out.println((first_num + second_num) % third_num);
        System.out.println(((first_num % third_num) + (second_num % third_num)) % third_num);
        System.out.println((first_num * second_num) % third_num);
        System.out.print(((first_num % third_num) * (second_num % third_num)) % third_num);

    }

}