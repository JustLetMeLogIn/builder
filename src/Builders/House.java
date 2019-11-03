package Builders;

public class House implements HousePlan {
    private String material;
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;


    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    @Override
    public void setRoof() {

    }

    @Override
    public void setDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void setWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public void setGarage() {

    }

    public String getMaterial(){
        return material;
    }
}
