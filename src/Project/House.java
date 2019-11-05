package Project;

public class House{

    private String material;
    private String roofType;
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;


    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public void setRoof(String roofType) {
        this.roofType = roofType;
    }

    public void setDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

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
