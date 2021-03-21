public class Animal implements Drawable, Resizable, Rotatable, Sounds {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void playSound() {
        System.out.println("\nAnimal sound.");
    }

    public void resizeObject() {
        System.out.println("\nResizing an Animal.");
    }

    public void drawObject() {
        System.out.println("\nDrawing an Animal.");
    }

    public void rotateObject() {
        System.out.println("\nRotating an Animal.");
    }
    
}