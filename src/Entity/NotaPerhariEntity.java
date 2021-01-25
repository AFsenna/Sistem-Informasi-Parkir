package Entity;

import java.util.Date;

public class NotaPerhariEntity extends NotaAbstractEntity{
    private String TanggalMasuk;
    private String BulanMasuk;
    private String TahunMasuk;
    private int TanggalKeluar;
    private int BulanKeluar;
    private int TahunKeluar;

    public NotaPerhariEntity(String TanggalMasuk,String BulanMasuk,String TahunMasuk, int TanggalKeluar,int BulanKeluar,int TahunKeluar, String Kondisi, int Harga,int NoNota) {
        super(Harga,Kondisi,NoNota);
        this.TanggalMasuk = TanggalMasuk;
        this.BulanMasuk = BulanMasuk;
        this.TahunMasuk = TahunMasuk;
        this.TanggalKeluar = TanggalKeluar;
        this.BulanKeluar = BulanKeluar;
        this.TahunKeluar = TahunKeluar;
    }
    
    public NotaPerhariEntity(){
    }
    
    @Override
    public int getHarga(){
        return Harga;
    }
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }

    public int getNoNota() {
        return NoNota;
    }

    public void setNoNota(int NoNota) {
        this.NoNota = NoNota;
    }
    
    public String getTanggalMasuk() {
        return TanggalMasuk;
    }

    public String getBulanMasuk() {
        return BulanMasuk;
    }

    public void setBulanMasuk(String BulanMasuk) {
        this.BulanMasuk = BulanMasuk;
    }

    public String getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(String TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }
    public int getTanggalKeluar() {
        return TanggalKeluar;
    }

    public void setTanggalKeluar(int TanggalKeluar) {
        this.TanggalKeluar = TanggalKeluar;
    }

    public int getBulanKeluar() {
        return BulanKeluar;
    }

    public void setBulanKeluar(int BulanKeluar) {
        this.BulanKeluar = BulanKeluar;
    }

    public int getTahunKeluar() {
        return TahunKeluar;
    }

    public void setTahunKeluar(int TahunKeluar) {
        this.TahunKeluar = TahunKeluar;
    }
}
