import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de caracteres:");
        int n = sc.nextInt();
        int i,j;
        for (i=1; i <= n; i++){
            if (i %2==0) {
                System.out.printf(".");
            } else {
                System.out.printf("*");
            }
        }
        System.out.printf("\n");

        i=1;
        while (i <= n) {
            j = 1;
            while (j <= 4 && i <=n){
                if (j==1){
                    System.out.printf("1");
                } else if(j==2) {
                    System.out.printf("2");
                } else if (j==3) {
                    System.out.printf("3");
                } else if (j==4) {
                    System.out.printf("4");
                }
                j++;
                i++;
            }
        }
        System.out.printf("\n");

        i=1;
        while (i <= n) {
            j = 1;
            while (j <= 3 && i <=n){
                if (j ==1){
                    System.out.printf("|");
                } else if(j==2) {
                    System.out.printf("|");
                } else if (j==3) {
                    System.out.printf("*");
                }
                j++;
                i++;
            }
        }
    }
}
