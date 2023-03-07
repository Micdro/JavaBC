/**
 * This is the code to play with inheritance.
 */
public class Animal {
        private String type;
        private  String size;
        private double weight;

    /**
     * Default constructor
     */
    public Animal() {

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    /**
     * This method will print out how quickly or slowly the animal moves
     * @param speed is the speed the animal moves
     */
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    /**
     * This method will print out when an animal type makes a noise
     */
    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }

}
