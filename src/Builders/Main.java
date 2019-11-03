package Builders;

public class Main {
    public static void main(String[] args) {

        HouseBuilder strawHouseBuilder = new StrawHouseBuilder();

        Engineer engineer = new Engineer(strawHouseBuilder);

        engineer.buildHouse();

        House firstHouse = engineer.getHouse();
        System.out.println(firstHouse.getMaterial());

    }

}
