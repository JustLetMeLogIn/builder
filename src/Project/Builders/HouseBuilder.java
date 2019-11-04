package Project.Builders;

import Project.House;

public interface HouseBuilder {

    public void useMaterial();

    public void buildWalls();

    public void buildRoof();

    public void buildDoors();

    public void buildWindows();



    public House getHouse();

}
