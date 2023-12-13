package Classes;

import AbstractClasses.*;
import Interfaces.ICarry;
import Interfaces.Objectable;
public class Pilulkin extends Human implements ICarry {
    public static final Pilulkin INSTANSE = new Pilulkin();
    private Pilulkin(){
        this.setName("Pilulkin");
    }
    //public Pilulkin(String location){
    //    this.setName("Pilulkin");
    //    this.setLocation(location);
    //}
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
