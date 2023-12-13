package Classes;

import AbstractClasses.*;
import Interfaces.ICarry;
import Interfaces.ISpeak;
import Interfaces.Objectable;

public class Znayka extends  Human implements ICarry, ISpeak{
    public static final Znayka INSTANSE = new Znayka();
    private Znayka(){
        this.setName("Znayka");
    }
    //public Znayka(String location){
    //    this.setName("Znayka");
    //    this.setLocation(location);
    //}
    // Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
    //Interfaces.ISpeak
    @Override
    public void say(String phrase) {
        System.out.println(this.getName() + " say: " + phrase);
    }
}
