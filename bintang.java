import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        int i, j, n;
        Scanner inp = new Scanner(System.in);
        System.out.print("masukan n baris = ");
        n = inp.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 2*(n -i ); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
