package koperasigettersetter;

public class Anggota2 {
    private String nomorKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota2(String nomorKtp, String nama, int limitPeminjaman){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getLimitPinjaman(){
        return limitPeminjaman;
    }

    public void setLimitPinjaman(int limitPeminjaman){
       this.limitPeminjaman = limitPeminjaman;
    }

    public int getJumlahPinjaman(){
        return this.jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman){
        if(jumlahPinjaman > limitPeminjaman){
            System.out.println("Jumlah Pinjaman melebihi batas");
        }else{
            this.jumlahPinjaman += jumlahPinjaman;
        }
    }

    public void angsur(int jumlahAngsur){
        if(jumlahAngsur<(limitPeminjaman/10)){
            System.out.println("maaf,angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= jumlahAngsur;
        }
       
    }
    
}
