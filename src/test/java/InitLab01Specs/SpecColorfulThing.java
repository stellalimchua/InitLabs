package InitLab01Specs;

import initlab01.ColorfulThing;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Stella on 1/25/16.
 */


public class SpecColorfulThing {
    @Test

    public void testGetColor() {
        ColorfulThing colorObjects = new ColorfulThing("pink");
        String colorName = colorObjects.getColor();
        assertEquals("should return pink","pink", colorName);
    }
}
