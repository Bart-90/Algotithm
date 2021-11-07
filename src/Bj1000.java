import java.util.Scanner;

public class Bj1000 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        compare(a,b);

        sc.close();
    }

    public static void compare(int a, int b){

        if(a < 0){
            System.out.println("a는 0보다 커야 합니다.");
        }else if(b >= 10){
            System.out.println("b는 10보다 작아야 합니다.");
        }else{
            System.out.println(a + b);
        }
    }

}
