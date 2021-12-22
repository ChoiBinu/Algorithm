import java.util.Scanner;

public class q_1000 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int i=0;

        for(i=0; i<=1; i++) {
            sum += sc.nextInt();
        }

        sc.close();

        System.out.print(sum);

    }

}