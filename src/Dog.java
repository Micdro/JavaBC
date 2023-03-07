public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "Big", 50);
    }

    /**
     * This is an example of constructor chaining
     * @param type is the type of dog
     * @param weight is the dogs weight
     */
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    /**
     * This constructor will enable a Dog to be created
     * @param type is the type of dog being created
     * @param weight is the weight of the dog in String format
     * @param earShape is the shape of the ear of the dog in String format
     * @param tailShape is the shape of the tail of the dog in string format
     */
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35) ? "medium" : "large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs wak, run, and wag their tail");
    }
}
