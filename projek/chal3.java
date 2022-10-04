// import java.util.*;
// import java.text.DecimalFormat;
// public class chal3 {
// private static Scanner scan = new Scanner(System.in);
// private static int pilihan = 0;
// private static float nilai;
// private static String nim;
// private static String nama;
// private static ArrayList<String> ListNim = new
// ArrayList<String>();
// private static ArrayList<Float> ListNilai = new
// ArrayList<Float>();
// private static ArrayList<String> ListNama = new
// ArrayList<String>();
// private static char yn;
// private static final String format = "###.##";
// private static final DecimalFormat df = new
// DecimalFormat(format);
// private static int peringkat;
// private static void pilihMenu() {
//     System.out.println("### Program Data Mahasiswa ###");
//     System.out.println("1. Input Data Mahasiswa");
//     System.out.println("2. Lihat Data Mahasiswa");
//     System.out.println("3. Cari Nilai Mahasiswa Tertinggi");
//     System.out.println("4. Cari Nilai Mahasiswa Terendah");
//     System.out.println("5. Keluar");
//     System.out.print("Silahkan pilih menu: ");
//     pilihan = scan.nextInt();
//     scan.nextLine();
// }
// private static void inputNilai() {
//     System.out.println("\n1. Input Data Mahasiswa");
//     while(true) {
//     System.out.print("Masukkan NIM: ");
//     nim = scan.next();
//     scan.nextLine();
//     ListNim.add(nim);
//     System.out.print("Masukkan Nama: ");
//     nama = scan.next();
//     scan.nextLine();
//     ListNama.add(nama);
//     System.out.print("Masukkan nilai: ");
//     nilai = scan.nextFloat();
//     scan.nextLine();
//     ListNilai.add(nilai);
//     System.out.print("\nLanjutkan input nilai (y/n)?");
//     yn = scan.next().charAt(0);
//     if(yn != 'y') {
//     break;
//     }
// }
// System.out.println("");
// }
// private static void lihatNilai() {
//     System.out.println("\n2. Lihat Data Mahasiswa");
//     for(int a = 0; a < ListNim.size(); a++){
//         nim = ListNim.get(a);
//         nama = ListNama.get(a);
//         nilai = ListNilai.get(a);
//         System.out.printf("%15s %3s %20s %3s %6.2f", nim, " | ", nama, " | ", nilai);
//         System.out.println();
//         }
//     }
//     private static void cariNilaiTertinggi() {
//     System.out.println("\n3. Cari Nilai Mahasiswa Tertinggi");
//     while(true) {
//         System.out.print("Masukkan peringkat: ");
//         peringkat = scan.nextInt();
//         scan.nextLine();
        
//         Collections.sort(ListNilai);
//         System.out.println(df.format(ListNilai.get(ListNilai.size() - peringkat)));
    
        
//         nim = ListNim.get(ListNim.size() - peringkat);
//         nama = ListNama.get(ListNama.size() - peringkat);
//         nilai = ListNilai.get(ListNilai.size() - peringkat);
        
//         System.out.printf("%13s %4s %20s %4s %6.2f", nim, " | ", nama, " | ", nilai);


//         System.out.print("\nLanjutkan cari nilai tertinggi (y/n)?");
//         yn = scan.next().charAt(0);
        
//         if(yn != 'y') {
//             break;
//         }
//     System.out.println("");
//     }
//     }
// private static void cariNilaiTerendah() {
//     System.out.println("\n3. Cari Nilai Mahasiswa Terendah");
//     while(true) {
//         System.out.print("Masukkan peringkat: ");
//         peringkat = scan.nextInt();
//         scan.nextLine();
        
//         Collections.sort(ListNilai);
        
//         nim = ListNim.get(peringkat - 1);
//         nama = ListNama.get(peringkat - 1);
//         nilai = ListNilai.get(peringkat - 1);
        
//         System.out.printf("%13s %4s %20s %4s %6.2f", nim, " | ", nama, " | ", nilai);

//         System.out.print("\nLanjutkan cari nilai terendah (y/n)?");
//         yn = scan.next().charAt(0);
        
//         if(yn != 'y') {
//             break;
//         }
//     System.out.println("");
//       }
//     }
// public static void main(String[] args) {
//     while(true) {
//     pilihMenu();
//     switch(pilihan) {
//     case 1:
//     inputNilai();
//     break;
//     case 2:
//     lihatNilai();
//     break;
//     case 3:
//     cariNilaiTertinggi();
//     break;
//     case 4:
//     cariNilaiTerendah();
//     break;
//     case 5:
//     System.exit(0);
//     break;
//     default:
// System.out.println("Maaf,pilihan tidak valid!."+
// "\nSilahkan ulangi masukkan pilihan!");
// break;
//             }
//         }
//     }
// }

