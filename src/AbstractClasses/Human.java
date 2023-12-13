package AbstractClasses;

import Interfaces.*;

public abstract class Human implements Objectable {
    private String name = "Someone Unknown";
    private String location = "Somewhere";
    public void setName(String name){    this.name = name;   }
    public String getName(){
        return this.name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "this is " + this.name + ", located in " + this.location;
    }
    @Override
    public boolean equals(Object obj) {
        Human human = (Human) obj;
        return this.name.equals(human.name);
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public void move(String newLocation) {
        System.out.println(this.getName() + " go to " + newLocation + " from " + this.getLocation());
        this.setLocation(newLocation);
    }
    //public Human(String name){
    //    this.name = name;
    //}
    //public Human(String name, String location){
    //    this.name = name;
    //    this.location = location;
    //}
}
