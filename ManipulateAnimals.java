public class ManipulateAnimals {
    public static void main(String[] args) {
        Animal[] animals = {new Animal("dog"), new Animal("cat")};
        Vehicle[] cars = {new Vehicle("Honda", 11), new Vehicle("Ford", 5)};

        for (int i = 0; i < animals.length; i++) {
            animals[i].playSound();
            animals[i].rotateObject();
            animals[i].resizeObject();
            animals[i].drawObject();

            cars[i].playSound();
            cars[i].rotateObject();
            cars[i].resizeObject();
            cars[i].drawObject();
        }
    }
}