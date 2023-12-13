package Classes;
import Enums.*;
import Exceprions.DencityException;

public class Material {
    private int massPerMeter3;
    private MaterialsName materialsName;
    public Material(MaterialsName materialsName){
        this.materialsName = materialsName;

    }

    public int getMassPerMeter3() {
        return massPerMeter3;
    }
    public void setMassPerMeter3(int massPerMeter3) {
        if (massPerMeter3<0){
            throw new DencityException();
        }else {
            this.massPerMeter3 = massPerMeter3;
        }
    }

    public MaterialsName getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(MaterialsName materialsName) {
        this.materialsName = materialsName;
    }
}
