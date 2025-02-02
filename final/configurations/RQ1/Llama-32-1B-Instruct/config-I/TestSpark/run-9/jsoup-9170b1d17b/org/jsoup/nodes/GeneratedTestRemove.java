package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        // Test the remove method to remove a specific attribute.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.remove("value1");

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}