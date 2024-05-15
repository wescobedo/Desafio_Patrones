import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese n:");
        int num = sc.nextInt();

        Patron1(num);
        Patron2(num);
        Patron3(num);
        Patron4(num);

    }

    public static void Patron1(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == (num - 1) || j == 0 || j == (num - 1)) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void Patron2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (num); j++) {
                if (i == 0 || i == (num - 1) ) {
                    System.out.printf("*");
                } else {
                    while (j < (num - i-1))
                    {
                        System.out.printf(" ");
                        j++;
                    }
                    System.out.printf("*");
                    j=num;
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void Patron3(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <num; j++) {
                if (i == j) {
                    System.out.printf("x");
                } else if (i == (num - j-1) ) {
                    System.out.printf("x");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void Patron4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (num); j++) {
                if (i == 0) {
                    while (j < (num - i-1))
                    {
                        System.out.printf("*");
                        j++;
                    }
                    j=num;
                } else if (i == (num - 1) ) {
                    System.out.printf(" ");
                    while (j < (num-1))
                    {
                        System.out.printf("*");
                        j++;
                    }
                    j=num;
                } else {
                    System.out.printf(" ");
                    while (j < (num-2))
                    {
                        System.out.printf("*");
                        j++;
                    }
                    j=num;
                }
            }
            System.out.println();
        }
    }
}
