package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveKey {

    @Test
    public void testRemoveKey() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        String key = attributes.remove("a");

        System.out.println(key); // prints "b"
        System.out.println(attributes.getKeys()); // prints ["b"]
    }

}