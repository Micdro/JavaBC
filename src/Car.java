import java.util.Locale;

/**
 * This is the Car class which will return the current vehicle type.
 */
public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "White";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar()
    {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "")
        );
    }

    public void setMake(String make)
    {
        if (make == null) make = "Unknown";
        //String lowercaseMake = make.toLowerCase();
        switch (make.toLowerCase())
        {
            case "holden", "porsche", "tesla" -> this.make = make;
            default ->
            {
                this.make = "Unsupported";
            }
        }
    }

    public String getMake()
    {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
