package Project.Builders;

import Project.Builders.HouseBuilder;
import Project.House;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;
    public ConcreteHouseBuilder(){
        house = new House();
    }

    @Override
    public void useMaterial() {
        house.setMaterial("Concrete");
    }

    @Override
    public void buildWalls() {
        house.setWalls(20);
    }

    @Override
    public void buildRoof() { house.setRoof("Flat");

    }

    @Override
    public void buildDoors() {
        house.setDoors(10);
    }

    @Override
    public void buildWindows() {
        house.setWindows(30);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
