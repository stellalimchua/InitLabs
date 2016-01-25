package initlab01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Stella on 1/25/16.
 */


public class SpecColorfulThing {
    @Test

    public void testGetColor() {
        ColorfulThing colorObjects = new ColorfulThing(Color.COCOA);
        String colorName = colorObjects.getColor().toString();
        assertEquals("should return COCOA","COCOA", colorName);
        System.out.println(colorName);
    }
}
