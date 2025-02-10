package org.jsoup.safety;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetEnforcedAttributes {

    @Test
    public void testGetEnforcedAttributes() {
        // Arrange
        Map<String, AttributeValue> enforcedValues = new HashMap<>();
        enforcedValues.put("testAttr", new AttributeValue("#"));
        Map<String, AttributeValue> keyVals = new HashMap<>();

        enforcedValues.put("testKey", new AttributeValue("key1"));

        // Act
        Attributes attrs = getEnforcedAttributes("testAttr");

        // Assert
        assertEquals(2, attrs.size());
    }

}