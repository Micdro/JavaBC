public class AnimalMain {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast");

    Dog yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "Fast");
    Dog retriever = new Dog("Labrador retriever", 65, "floppy", "Swimmer");
    doAnimalStuff(retriever, "slow");

    Dog wolf = new Dog("wolf", 40);
    doAnimalStuff(wolf, "slow");
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
