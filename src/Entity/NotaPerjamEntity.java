package Entity;
import java.util.Date;
public class NotaPerjamEntity extends NotaAbstractEntity{
    private Date TanggalMasuk;
    private String JamMasuk;
    private String MenitMasuk;
    private int JamKeluar;
    private int MenitKeluar;
    
    public NotaPerjamEntity(int Harga, int NoNota, String kondisi,Date TanggalMasuk, String JamMasuk, String MenitMasuk, int JamKeluar, int MenitKeluar){
        super(Harga,kondisi,NoNota);
        this.TanggalMasuk = TanggalMasuk;
        this.JamMasuk = JamMasuk;
        this.JamKeluar = JamKeluar;
        this.MenitMasuk = MenitMasuk;
        this.MenitKeluar = MenitKeluar;
    }

    public NotaPerjamEntity(){
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
    public void setMenitMasuk(String MenitMasuk) {
        this.MenitMasuk = MenitMasuk;
    }
    
    public Date getTanggalMasuk() {
        return TanggalMasuk;
    }

    public String getJamMasuk() {
        return JamMasuk;
    }

    public String getMenitMasuk() {
        return MenitMasuk;
    }

    public int getJamKeluar() {
        return JamKeluar;
    }

    public void setJamKeluar(int JamKeluar) {
        this.JamKeluar = JamKeluar;
    }

    public int getMenitKeluar() {
        return MenitKeluar;
    }
    
    public void setMenitKeluar(int MenitKeluar) {
        this.MenitKeluar = MenitKeluar;
    }
}

