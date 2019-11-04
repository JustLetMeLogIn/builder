package TheNonBuilderWay;

public class House {
    public static void main(String[] args) {

        House strawHouse = new House("Straw", "Shitty roof", 2, 1, 0);
        House garbageHouse = new House("Garbage", "What roof?", 1, 1, 1);
        House concreteHouse = new House("Straw", "Flat", 12, 1, 6);

    }


    private String material;
    private String roofType;
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;

    public House(String material, String roofType, int numberOfWalls, int numberOfDoors, int numberOfWindows) {
        this.material = material;
        this.roofType = roofType;
        this.numberOfWalls = numberOfWalls;
        this.numberOfDoors = numberOfDoors;


    }
}
