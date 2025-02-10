package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        String key1 = "key1";
        String key2 = "key2";

        attributes.remove(key1);
        attributes.remove(key2);

        Assertions.assertFalse(attributes.hasKey(key1));
        Assertions.assertFalse(attributes.hasKey(key2));

        Assertions.assertTrue(attributes.isEmpty());
    }

}