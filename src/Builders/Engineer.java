package Builders;

public class Engineer  {


    private HouseBuilder houseBuilder;

    public Engineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void buildHouse(){
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        houseBuilder.buildWindows();
    }

}
