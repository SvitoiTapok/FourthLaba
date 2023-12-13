package Classes;
import Enums.*;

public class Material {
    private int massPerMeter3;
    private MaterialsName materialsName;
    public Material(int massPerMeter3, MaterialsName materialsName){
        this.materialsName = materialsName;
        this.massPerMeter3 = massPerMeter3;
    }

    public int getMassPerMeter3() {
        return massPerMeter3;
    }
    public void setMassPerMeter3(int massPerMeter3) {
        massPerMeter3 = massPerMeter3;
    }

    public MaterialsName getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(MaterialsName materialsName) {
        this.materialsName = materialsName;
    }
}
