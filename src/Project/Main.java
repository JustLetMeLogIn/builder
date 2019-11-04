package Project;

import Project.Builders.ConcreteHouseBuilder;
import Project.Builders.GarbageHouseBuilder;
import Project.Builders.HouseBuilder;
import Project.Builders.StrawHouseBuilder;

public class Main {
    public static void main(String[] args) {

        HouseBuilder strawHouseBuilder = new StrawHouseBuilder();
        Engineer hipPiggy = new Engineer(strawHouseBuilder);
        hipPiggy.buildHouse();
        House firstHouse = hipPiggy.getHouse();

        checkHouse(firstHouse);

        HouseBuilder garbageHouseBuilder = new GarbageHouseBuilder();
        Engineer stokedPiggy = new Engineer(garbageHouseBuilder);
        stokedPiggy.buildHouse();
        House secondHouse = stokedPiggy.getHouse();

        checkHouse(secondHouse);

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        Engineer gradeAStudent = new Engineer(concreteHouseBuilder);
        gradeAStudent.buildHouse();
        House thirdHouse = gradeAStudent.getHouse();

        checkHouse(thirdHouse);

    }

    public static void checkHouse(House house) {

        System.out.println("This house is made of " + house.getMaterial());
        System.out.println("It has a " + house.getRoofType() + " roof type.");
        System.out.println("There are " + house.getNumberOfDoors() + " doors.");
        System.out.println("It has " + house.getNumberOfWalls() + " walls.");
        System.out.println("There are " + house.getNumberOfWindows() + " windows.\n");
    }

}
