import java.util.Scanner;

public class genap {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("masukan n = ");
        n = inp.nextInt();
        int i = 1;
        while (i<=2*n) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
            i = i +1;
        }
    } 
}
