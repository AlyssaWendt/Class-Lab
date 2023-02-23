/**
 * Plane
 */
public class Plane {
    String color;
    // make a more instance
    String name;

    public Plane(String planeColor, String name) {
        color = planeColor;
        this.name = name;
    }

    public void flying(){
        System.out.println("UP UP and Away");
    }
    public void toString() {
        System.out.println("The plane you're flying is " + name + ", if you can see it in the sky it's the color " + color + "!");
    }
    public static void main(String[] args) {
    Plane spitfire = new Plane("army green","Spitfire");
    spitfire.flying();
    spitfire.toString();

    System.out.println(spitfire.color);
    System.out.println(spitfire.name);
        
    }
}
