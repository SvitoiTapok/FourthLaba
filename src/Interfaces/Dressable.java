package Interfaces;

import java.util.ArrayList;

public interface Dressable {
    public ArrayList<String> getClothes();
    public void setClothes(ArrayList<String> clothes);
    public void showClothes();
    public void takeOffCloth(String cloth);
}
