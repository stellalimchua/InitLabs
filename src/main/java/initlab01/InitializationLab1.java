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

        /*ColorfulThing redObject = new ColorfulThing("red");
        ColorfulThing orangeObject = new ColorfulThing("orange");
        ColorfulThing yellowObject = new ColorfulThing("yellow");
        ColorfulThing greenObject = new ColorfulThing("green");
        ColorfulThing blueObject = new ColorfulThing("blue");*/

        ColorfulThing lavObject = new ColorfulThing(Color.LAVENDER);
        ColorfulThing cocoaObject = new ColorfulThing(Color.COCOA);
        ColorfulThing sparkleObject = new ColorfulThing(Color.SPARKLE);


        System.out.println(sparkleObject.getColor());
        System.out.println(cocoaObject.getColor());
        System.out.println(lavObject.getColor());
    }
}

