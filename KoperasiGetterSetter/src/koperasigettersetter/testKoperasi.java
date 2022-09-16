
package koperasigettersetter;
import java.util.Scanner;
public class testKoperasi {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int pinjam, angsur;

        Anggota2 donny = new Anggota2("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("Masukkan jumlah pinjaman anda : ");
        pinjam = input.nextInt();
        donny.pinjam(pinjam);

        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMeminjam uang 4.000.000..."); 
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("Masukkan jumlah angsuran anda : ");
        angsur = input.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());




    }  
}
