package initlab01;

/**
 * Created by Stella on 1/21/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing juice = new BoringThing();
        BoringThing blender = new BoringThing();
        BoringThing tara = new BoringThing();
        BoringThing tiger = new BoringThing();
        BoringThing necklace = new BoringThing();

        ColorfulThing redObject = new ColorfulThing("red");
        ColorfulThing orangeObject = new ColorfulThing("orange");
        ColorfulThing yellowObject = new ColorfulThing("yellow");
        ColorfulThing greenObject = new ColorfulThing("green");
        ColorfulThing blueObject = new ColorfulThing("blue");

        System.out.println(redObject.getColor());
        System.out.println(greenObject.getColor());
        System.out.println(orangeObject.getColor());
        System.out.println(yellowObject.getColor());
        System.out.println(blueObject.getColor());
    }
}

