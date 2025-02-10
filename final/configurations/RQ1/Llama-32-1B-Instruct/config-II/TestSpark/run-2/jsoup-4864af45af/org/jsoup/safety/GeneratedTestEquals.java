package org.jsoup.safety;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Arrange
        Map<String, AttributeValue> keyVals1 = new HashMap<>();
        keyVals1.put("key1", new AttributeValue("value1"));
        keyVals1.put("key2", "value2");

        Map<String, AttributeValue> keyVals2 = new HashMap<>();
        keyVals2.put("key1", new AttributeValue("value1"));

        // Act
        boolean result1 = Attributes.main(keyVals1);
        boolean result2 = Attributes.main(keyVals2);

        // Assert
        assertTrue(result1);
        assertFalse(result2);
    }
}

}