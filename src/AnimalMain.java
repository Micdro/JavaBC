public class AnimalMain {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast");
    }

    /**
     * This is the method to test my classes (Animal & Dog)
     * @param animal is the animal to be sent through the method
     * @param speed is the speed of the animal
     */
    public static void doAnimalStuff(Animal animal,String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
