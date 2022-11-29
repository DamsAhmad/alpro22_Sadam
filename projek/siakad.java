import java.util.Scanner;
public class siakad {

public static Scanner scan = new Scanner(System.in);
public static int pilihan = 0;
public static Mahasiswa[] mahasiswa = new Mahasiswa[1000];
public static int jumlahData = 0;

    public static void pilihMenu() {
        System.out.println("\n### Menu Siakad ###");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Urutkan Data");
        System.out.println("4. Keluar");
        System.out.print("Silahkan pilih menu: ");
        pilihan = scan.nextInt();
    scan.nextLine();
    }
    public static void tambahData(){
        System.out.println("\n1. Silahkan Tambah Data");
        
        while(true) {
        mahasiswa[jumlahData] = new Mahasiswa();
        System.out.print("nama: ");
        mahasiswa[jumlahData].setNama(scan.next());
        System.out.print("nim: ");
        mahasiswa[jumlahData].setNim(scan.nextInt());
        jumlahData++;
        System.out.print("\nLanjutkan input (y/n)?");
        char yn = scan.next().charAt(0);
        if(yn != 'y') {
            break;
        }
    }
}
    public static void lihatData(){
        System.out.println("\n2. Lihat Data ");
        System.out.println("Berikut Data Anda");
        int i = 0;
        while(i<jumlahData){
            System.out.println("\nnama:" + mahasiswa[i].getNama()); 
            System.out.println("nim:" + mahasiswa[i].getNim()); 
            i++;
        }
    }
    public static void urutkanData() {
    int pilih;
        System.out.println("\n### Pilih Algoritma Pengurutan ###");
        System.out.println("1. Exchange Sort");
        System.out.print("Silahkan pilih algoritma: ");
        pilih = scan.nextInt();
        switch(pilih){
            case 1:
            exchangeSort();
            break;
        }
     }
    public static void exchangeSort(){
        // mahasiswa[jumlahData] = new Mahasiswa();
        for (int x =0; x<jumlahData; x++){
            for(int y = x+1; y<jumlahData ;y++){
                if (mahasiswa[x].getNim()>mahasiswa[y].getNim()) {
                    Mahasiswa temp = mahasiswa[x];
                    mahasiswa[x] = mahasiswa[y];
                    mahasiswa[y] = temp;
            }
        }
    }
    }
    public static void main(String[] args) {
        while(true) {
            pilihMenu();
            switch(pilihan) {
            case 1:
            System.out.println(pilihan);
            tambahData();
            break;
            case 2:
            System.out.println(pilihan);
            lihatData();
            break;
            case 3:
            System.out.println(pilihan);
            urutkanData();
            break;
            case 4:
            System.out.println(pilihan);
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