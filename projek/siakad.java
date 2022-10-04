import java.util.Scanner;
public class siakad {

private static Scanner scan = new Scanner(System.in);
private static int pilihan = 0;
private static Mahasiswa[] mahasiswa = new Mahasiswa[1000];
private static int jumlahData = 0;

    private static void pilihMenu() {
        System.out.println("\n### Menu Siakad ###");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Silahkan pilih menu: ");
        pilihan = scan.nextInt();
    scan.nextLine();
    }
    private static void tambahData(){
        System.out.println("\n1. Silahkan Tambah Data");
        
        while(true) {
        mahasiswa[jumlahData] = new Mahasiswa();
        System.out.print("nama: ");
        mahasiswa[jumlahData].setNama(scan.next());
        System.out.print("nim: ");
        mahasiswa[jumlahData].setNim(scan.next());
        jumlahData++;
        System.out.print("\nLanjutkan input (y/n)?");
        char yn = scan.next().charAt(0);
        if(yn != 'y') {
            break;
        }
    }
}
    private static void lihatData(){
        System.out.println("\n2. Lihat Data ");
        System.out.println("Berikut Data Anda");
        int i = 0;
        while(i<jumlahData){
            System.out.println("\nnama:" + mahasiswa[i].getNama()); 
            System.out.println("nim:" + mahasiswa[i].getNim()); 
            i++;
        }
        
    }
    public static void main(String[] args) {
        while(true) {
            pilihMenu();
            switch(pilihan) {
            case 1:
            tambahData();
            break;
            case 2:
            lihatData();
            break;
            case 3:
            System.exit(0);
            break;
            default:
        System.out.println("Maaf,pilihan tidak valid!."+
        "\nSilahkan ulangi masukkan pilihan!");
        break;
                    }
                }
            }
    }