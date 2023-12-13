package Classes;

import AbstractClasses.Human;
import Interfaces.IFossily;

public class Astronaut extends Human{
    public Astronaut(String location, String name){
        setLocation(location);
        setName(name);
    }
    @Override
    public String toString() {
        return "this is Austronaut " + getName() + ", located in " + getLocation();
    }
    public void mine(Material material, int time){
        class Fossiler implements IFossily {
        @Override
        public void productes(Material material, int time) {
            System.out.println(material.getMassPerMeter3()*time + " kilos of " + material.getMaterialsName() + " was producted by " + getName());
        }
    }
        Fossiler fossiler = new Fossiler();
        fossiler.productes(material, time);
    }
}
