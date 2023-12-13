package Classes;

import AbstractClasses.*;
import Interfaces.ICarry;
import Interfaces.Objectable;

public class Fucsia extends Human implements ICarry {
    public static final Fucsia INSTANSE = new Fucsia();
    private Fucsia(){
        this.setName("Fucsia");
    }
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
