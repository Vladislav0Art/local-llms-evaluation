package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        boolean hasKey1 = attributes.hasKey("a"); // prints true
        boolean hasKey2 = attributes.hasKey("c");

        System.out.println(hasKey1); // prints false

        boolean hasValue1 = attributes.hasValue("a"); // prints true
        boolean hasValue2 = attributes.hasValue("c");

        System.out.println(hasValue1); // prints false
    }

}