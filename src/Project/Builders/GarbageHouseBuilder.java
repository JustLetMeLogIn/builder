package Project.Builders;

import Project.House;

public class GarbageHouseBuilder implements HouseBuilder {

    private House house;

    public GarbageHouseBuilder(){
        house = new House();
    }

    @Override
    public void useMaterial() {
        house.setMaterial("Garbage");
    }

    @Override
    public void buildWalls() {
        house.setWalls(1);
    }

    @Override
    public void buildRoof() { house.setRoof("What roof?"); }

    @Override
    public void buildDoors() {
        house.setDoors(1);
    }

    @Override
    public void buildWindows() {
        house.setWindows(1);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
