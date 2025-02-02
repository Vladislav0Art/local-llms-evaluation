package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        Attributes attributes = new Attributes();

        String value1 = "value1";
        attributes.add(value1);

        String value2 = "value2";
        attributes.add(value2);

        assertEquals("value1", attributes.getValue(0));
        assertEquals("value2", attributes.getValue(1));

        // Test removing values
        attributes.removeInternalPrefix("test");
        System.out.println(attributes.getValue(0)); // Expected: null

        // Test updating existing value
        value1 = "newValue";
        attributes.update(0, value1);
        System.out.println(attributes.getValue(0)); // Expected: newValue
    }

}