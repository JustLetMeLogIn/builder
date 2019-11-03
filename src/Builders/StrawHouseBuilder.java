package Builders;

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
        house.setWalls(4);
    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildDoors() {
        house.setDoors(1);
    }

    @Override
    public void buildWindows() {
        house.setWindows(0);
    }

    @Override
    public void buildGarage() {

    }

    @Override
    public House getHouse() {
        return house;
    }
}
