package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveAllKeys {

    @Test
    public void testRemoveAllKeys() {
        // Test the remove method to remove all keys.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.removeAllKeys();

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}