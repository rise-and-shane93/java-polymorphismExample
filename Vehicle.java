public class Vehicle implements Drawable, Resizable, Rotatable, Sounds {

    private String name;
    private int age;

    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void playSound() {
        System.out.println("\nVehicle sound.");
    }

    public void resizeObject() {
        System.out.println("\nResizing a Vehicle.");
    }

    public void drawObject() {
        System.out.println("\nDrawing a Vehicle.");
    }

    public void rotateObject() {
        System.out.println("\nRotating a Vehicle.");
    }
    
}