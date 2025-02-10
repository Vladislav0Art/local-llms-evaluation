package org.jsoup.safety;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsValidAttribute {

    @Test
    public void testIsValidAttribute() {
        // Arrange
        String attrKey = "testAttr";

        // Act
        boolean isValid = testGetEnforcedAttributes(attrKey).isValid("value");

        // Assert
        assertEquals(true, isValid);
    }

}