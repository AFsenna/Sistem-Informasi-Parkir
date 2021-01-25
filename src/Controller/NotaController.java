package Controller;
import Entity.NotaPerjamEntity;
import Entity.NotaPerhariEntity;
import java.util.Date;

public class NotaController {
    int menu,nonotajam,nonotahari;
    public void insertNotaJam(int Harga, int NoNota, String kondisi,Date TanggalMasuk, String JamMasuk, String MenitMasuk, int JamKeluar, int MenitKeluar){
        AllObjectModel.notaperjamModel.insert(new NotaPerjamEntity(Harga, NoNota,kondisi, TanggalMasuk, JamMasuk, MenitMasuk, JamKeluar, MenitKeluar));
    }
    
    public NotaPerjamEntity showDataNotajam(int index){
        return AllObjectModel.notaperjamModel.showData(index);
    }
    
    public void deleteNotaJam(int index){
        AllObjectModel.notaperjamModel.delete(index);
    }
    
    public void insertNotaHari(String TanggalMasuk,String BulanMasuk,String TahunMasuk, int TanggalKeluar,int BulanKeluar,int TahunKeluar, String Kondisi, int Harga,int NoNota){
        AllObjectModel.notaperhariModel.insert(new NotaPerhariEntity(TanggalMasuk, BulanMasuk, TahunMasuk, TanggalKeluar, BulanKeluar, TahunKeluar, Kondisi, Harga, NoNota));
    }
    
    public NotaPerhariEntity showDataNotaHari(int index){
        return AllObjectModel.notaperhariModel.showData(index);
    }
    
    public void deleteNotaHari(int index){
        AllObjectModel.notaperhariModel.delete(index);
    }
    
    public int getMenu(){
        return menu;
    }
    
    public void setMenu(int menu) {
        this.menu = menu;
    }

}