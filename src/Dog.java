public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50.0);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, Double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large")
                , weight);
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

    //overriding parent class
    public void makeNoise () {
        if (type == "wolf") {
            System.out.println("Ow wooooooooo!");
        }
        bark();
        System.out.println();
    }
    // subclass overriding parent class method.
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof!");
    }
    private void run(){
        System.out.println("Running!");
    }
    private void walk(){
        System.out.println("Walking");
    }
    private void wagTail(){
        System.out.println("Waging tail");
    }
}
