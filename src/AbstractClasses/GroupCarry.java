package AbstractClasses;

import Interfaces.*;

import java.util.ArrayList;

public abstract class GroupCarry{
    private ArrayList<ICarry> Carries;
    public GroupCarry(ArrayList<ICarry> Carries){
        this.Carries = Carries;
    }

    public ArrayList<ICarry> getCarriers() {
        return Carries;
    }

    public void setCarriers(ArrayList<ICarry> Carries) {
        this.Carries = Carries;
    }

    public void groupCarry(Objectable objectable, String newPlace) {
        if (this.Carries.size() >= 1) {

            for (ICarry i : this.Carries) {
                System.out.print(i.getName() + " ");
            }
            System.out.println("move " + objectable.getName() + " to " + newPlace + " from " + objectable.getLocation());
            objectable.setLocation(newPlace);
        }else {
            System.out.println("Have no carriers");
        }
    }
}
