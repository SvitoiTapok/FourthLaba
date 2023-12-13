package AbstractClasses;

public abstract class Sound {
    private String tune;
    public Sound(String tune){
        this.tune = tune;
    }
    public void sound(){
        System.out.println(tune+tune+tune);
    }

}
