package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestHasDataAttribute {

    @Test
    public void testHasDataAttribute() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        boolean hasKey1 = attributes.hasKey("a"); // prints true
        boolean hasValue1 = attributes.hasValue("a");

        System.out.println(hasKey1); // prints false

        String value1 = attributes.getValue("a");
        if (value1 != null) {
            System.out.println(value1);
        } else {
            System.out.println(attributes.getValues());
        }
    }

}