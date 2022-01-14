package at.hoeblinger;

import java.util.LinkedList;
import java.util.List;

public class Building {

    public int id;
    public List<String> residents = new LinkedList<>();

    public Building(int id, String initialResident){
        this.id = id;
        residents.add(initialResident);
    }

    public void addResident(String resident){
        if(!residents.contains(resident)){
            residents.add(resident);
        }
    }

    public int getNumberOfResidents(){
        return residents.size();
    }
}
