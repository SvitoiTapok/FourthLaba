package Classes;

import AbstractClasses.*;
import Interfaces.Dressable;

import java.util.ArrayList;
public class Neznayka extends Human implements Dressable {
    public static final Neznayka INSTANSE = new Neznayka();
    private NeznaykaPower neznaykaPower = new NeznaykaPower(100);
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
    class NeznaykaPower{
        private int point;
        public NeznaykaPower(int point){
            this.point = point;
        }
        public void setPoint(int point) {
            this.point = point;
        }
        public int getPoint() {
            return point;
        }
        public boolean isWeak(){
            if(canMove){
                return point>100;
            }else {
                return point>50;
            }
        }
    }
    public void lay(String bed) {
        this.setLocation(bed);
        setCanMove(false);
        System.out.println(getName() + " lay on " + bed);
    }
    public void weaking(String reason){
        this.neznaykaPower.setPoint(neznaykaPower.getPoint()-20);
        if (neznaykaPower.isWeak()){
            System.out.println("Now Neznayka weak because of " + reason);
        }else {
            System.out.println("Now Neznayka stay strong despite of " + reason);
        }
    }

}
