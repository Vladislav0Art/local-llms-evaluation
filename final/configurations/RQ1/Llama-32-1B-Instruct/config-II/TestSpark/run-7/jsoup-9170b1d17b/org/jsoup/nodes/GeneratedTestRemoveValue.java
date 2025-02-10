package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveValue {

    @Test
    public void testRemoveValue() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        String value = attributes.remove("b");

        System.out.println(value); // prints "1"
        System.out.println(attributes.getValues()); // prints ["b"]
    }

}