package Homework1;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> listaFructe;
    public Basket(){
        listaFructe = new ArrayList<String>();
    }

    public void add(String fructNou){
        listaFructe.add(fructNou);
    }

    public int count(){
        return listaFructe.size();
    }

    public int customCount(){
        int nr=0;
        for(int i=0; i<listaFructe.size();i++)
            nr++;
        return nr;
    }

    //Nu stiu sa fac returnarea de colectie unica

    public int position(String fruct){
        return listaFructe.indexOf(fruct) + 1;
    }
    public boolean remove(String fruct){
        while(!listaFructe.isEmpty())
            if(listaFructe.contains(fruct)){
                listaFructe.remove(fruct);
                return true;
            }
        return false;
    }

    public boolean find(String fruct){
        if(listaFructe.contains(fruct))
            return true;
        else return false;
    }
}
