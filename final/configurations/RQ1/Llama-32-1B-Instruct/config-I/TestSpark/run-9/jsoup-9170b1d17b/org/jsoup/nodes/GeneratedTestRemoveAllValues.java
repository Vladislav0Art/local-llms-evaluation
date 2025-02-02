package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveAllValues {

    @Test
    public void testRemoveAllValues() {
        // Test the remove method to remove all values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.removeAllValues();

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}