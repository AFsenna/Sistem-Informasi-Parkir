package Model;

import Entity.NotaPerhariEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class NotaPerhariModel{
    private ArrayList <NotaPerhariEntity> notaperhariEntityArrayList;

    public NotaPerhariModel() {
        notaperhariEntityArrayList = new ArrayList <NotaPerhariEntity>();
    }
    
    public void insert(NotaPerhariEntity notaPerhari){
        notaperhariEntityArrayList.add(notaPerhari);
    }
    
    public NotaPerhariEntity showData(int index){
        return notaperhariEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperhariEntityArrayList.remove(index);
    }
    
}