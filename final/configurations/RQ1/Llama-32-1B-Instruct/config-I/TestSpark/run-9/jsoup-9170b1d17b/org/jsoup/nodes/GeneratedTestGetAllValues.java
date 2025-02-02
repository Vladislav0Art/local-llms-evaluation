package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetAllValues {

    @Test
    public void testGetAllValues() {
        // Test the get method to retrieve all values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        Object[] values = attributes.getAllValues();

        for (Object value : values) {
            System.out.println(value);
        }
    }

}