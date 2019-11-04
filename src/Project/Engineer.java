package Project;

import Project.Builders.HouseBuilder;

public class Engineer  {

    private HouseBuilder houseBuilder;

    public Engineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void buildHouse(){

        houseBuilder.useMaterial();
        houseBuilder.buildDoors();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        houseBuilder.buildWindows();

    }

}
