package Project.Builders;

import Project.House;

public class StrawHouseBuilder implements HouseBuilder {

    private House house;

    public StrawHouseBuilder(){
        house = new House();
    }

    @Override
    public void useMaterial() {
        house.setMaterial("Straw");
    }

    @Override
    public void buildWalls() {
        house.setWalls(2);
    }

    @Override
    public void buildRoof() { house.setRoof("Shitty roof"); }

    @Override
    public void buildDoors() {
        house.setDoors(1);
    }

    @Override
    public void buildWindows() {
        house.setWindows(0);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
