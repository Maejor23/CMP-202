public class LandAnimal extends Animal {
    @Override
    String move() {
        return "swings on trees";
    }

    public static void main(String[] args) {
        LandAnimal tiger = new LandAnimal();
        LandAnimal elephant = new LandAnimal();
        tiger.name = "musa";
        elephant.move();
        System.out.println(tiger.name);
        System.out.println(elephant.move());
    }

}
