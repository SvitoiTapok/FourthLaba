package Classes;

import AbstractClasses.*;
import Interfaces.Dressable;

import java.util.ArrayList;
public class Neznayka extends Human implements Dressable {
    public static final Neznayka INSTANSE = new Neznayka();
    private ArrayList<String> clothes = new ArrayList<>();
    private boolean canMove;
    private Neznayka(){
        this.setName("Neznayka");
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanMove() {
        return canMove;
    }

    //private Neznayka(String location){
    //    this.setName("Neznayka");
    //    this.setLocation(location);
    //}
    //private Neznayka(ArrayList<String> clothes){
    //    this.clothes = clothes;
    //}
    //dressable
    @Override
    public ArrayList<String> getClothes() {
        return this.clothes;
    }
    @Override
    public void setClothes(ArrayList<String> clothes) {
        this.clothes = clothes;
    }

    @Override
    public void showClothes() {
        if(this.clothes.size() >= 1) {
            System.out.println(this.getName() + " now wear: ");
            for (String i : this.clothes) {
                System.out.println(i);
            }
        }else {
            System.out.println(this.getName() +"have no clothes");
        }
    }

    @Override
    public void takeOffCloth(String cloth) {
        if(this.clothes.contains(cloth)){
            this.clothes.remove(cloth);
            System.out.println(this.getName() + " take off " + cloth);
        }else {
            System.out.println("Can't find this cloth");
        }
    }
    //Lying
    public static class Bed{
        private String location;
        private boolean comfortable;
        public Bed(String location, boolean comfortable){
            this.comfortable = comfortable;
            this.location = location;
        }
        public void setLocation(String location) {
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        public void setComfortable(boolean comfortable) {
            this.comfortable = comfortable;
        }

        public boolean isComfortable() {
            return comfortable;
        }
    }
    public void lay(Bed bed) {
        this.setLocation(bed.getLocation());
        setCanMove(false);
        System.out.println(getName() + " lay on bed in " + bed.getLocation() + ". It's " + (bed.isComfortable() ? "comfortable" : "not comfortable"));
    }

}
