package Classes;

import AbstractClasses.*;
import Interfaces.ICarry;
import Interfaces.Objectable;

public class Seledochka extends Human implements ICarry {
    public static final Seledochka INSTANSE = new Seledochka();
    private Seledochka(){
        this.setName("Seledochka");
    }
    //public Seledochka(String location){
    //    this.setName("Seledochka");
    //    this.setLocation(location);
    //}
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
