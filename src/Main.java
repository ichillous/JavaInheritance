//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Animal animal = new Animal("Tiger", "Huge", 400.0);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorky", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65.0, "Floppy", "swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 50.0);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", "small", 2.0, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void  doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}