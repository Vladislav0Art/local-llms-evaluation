package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        Assertions.assertTrue(attributes.equals(attributes));
        Assertions.assertFalse(attributes.equals(new Attributes()));
    }

}