package Model;

import Entity.KendaraanEntity;
import java.util.ArrayList;

public class KendaraanModel{
    private ArrayList <KendaraanEntity> kendaraanEntityArrayList;
    
    public KendaraanModel() {
        kendaraanEntityArrayList = new ArrayList <KendaraanEntity>();
    }
    
    public void insert(KendaraanEntity kendaraan){
        kendaraanEntityArrayList.add(kendaraan);
    }    
    public KendaraanEntity showData(int index){
        return kendaraanEntityArrayList.get(index);
    }
    public void delete(int index){
        kendaraanEntityArrayList.remove(index);
    } 
    public int cekdata(String platnomer){   
        int loop = 0;
        for (KendaraanEntity kendaraanEntity : kendaraanEntityArrayList) {
            if (kendaraanEntity.getPlatNomor().equals(platnomer)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
}