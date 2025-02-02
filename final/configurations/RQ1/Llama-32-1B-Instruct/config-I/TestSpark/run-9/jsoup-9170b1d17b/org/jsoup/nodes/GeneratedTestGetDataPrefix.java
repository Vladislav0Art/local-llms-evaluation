package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetDataPrefix {

    @Test
    public void testGetDataPrefix() {
        // Test the get method to retrieve the data prefix.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        String dataPrefix = attributes.getDataPrefix();

        if (dataPrefix != null) {
            System.out.println(dataPrefix);
        } else {
            System.out.println(null);
        }
    }

}