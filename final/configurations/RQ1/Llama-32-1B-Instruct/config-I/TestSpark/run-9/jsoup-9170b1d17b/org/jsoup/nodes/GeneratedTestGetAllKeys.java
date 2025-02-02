package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetAllKeys {

    @Test
    public void testGetAllKeys() {
        // Test the get method to retrieve all keys.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        for (String key : attributes.getAllKeys()) {
            System.out.println(key);
        }
    }

}