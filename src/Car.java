import java.sql.SQLOutput;

public class Car {

    private  String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 5;
    private boolean convertable = true;

    public void describeCar(){
        System.out.println(
                doors + " -Door " +
                        color + " "+
                        make + " " +
                        model + " " +
                        (convertable ? "Converted" : "Not converted")

        );
    }

}
