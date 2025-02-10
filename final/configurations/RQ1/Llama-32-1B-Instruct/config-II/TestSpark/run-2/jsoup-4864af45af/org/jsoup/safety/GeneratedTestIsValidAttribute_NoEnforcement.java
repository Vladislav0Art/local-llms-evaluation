package org.jsoup.safety;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsValidAttribute_NoEnforcement {

    @Test
    public void testIsValidAttribute_NoEnforcement() {
        // Arrange
        String attrKey = "testAttr";
        String value = "";

        // Act
        boolean isValid = testGetEnforcedAttributes(attrKey).isValid(value);

        // Assert
        assertEquals(false, isValid);
    }
}

}