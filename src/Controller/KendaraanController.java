package Controller;

import Entity.KendaraanEntity;

public class KendaraanController {
    public void insert (String PlatNomor,String JenisKendaraan, String Kondisi){
        AllObjectModel.kendaraanModel.insert(new KendaraanEntity(PlatNomor, JenisKendaraan, Kondisi));
    }
    
    public KendaraanEntity showData(int index){
       return AllObjectModel.kendaraanModel.showData(index);
    }
    
    public void delete(int index){
        AllObjectModel.kendaraanModel.delete(index);
    }
    
    public int cekdataAkun(String platnomer){
        int cekdata = AllObjectModel.kendaraanModel.cekdata(platnomer);
        return cekdata;
    }
}
