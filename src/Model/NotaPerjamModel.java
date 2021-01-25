package Model;
import Entity.NotaPerjamEntity;
import java.util.ArrayList;

public class NotaPerjamModel{
    private ArrayList <NotaPerjamEntity> notaperjamEntityArrayList;
    public NotaPerjamModel() {
        notaperjamEntityArrayList = new ArrayList <NotaPerjamEntity>();
    }
    
    public void insert(NotaPerjamEntity notaPerhari){
        notaperjamEntityArrayList.add(notaPerhari);
    }
    
    public NotaPerjamEntity showData(int index){
        return notaperjamEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperjamEntityArrayList.remove(index);
    }
    
}
