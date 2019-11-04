package Project;

public class House implements HousePlan {
    private String material;
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;
    private String roofType;


    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    @Override
    public void setRoof(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public void setDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void setWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfWalls(){
        return numberOfWalls;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }

    public String getRoofType() {
        return roofType;
    }
}
