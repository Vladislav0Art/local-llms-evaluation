package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveValueWithCaseSensitivity {

    @Test
    public void testRemoveValueWithCaseSensitivity() {
        Attributes attributes = new Attributes();
        attributes.set("A", "1");
        attributes.set("B", 2);

        String value = internalKey("b");

        if (attributes.getValue(value) != null) {
            attributes.remove(value);
        }

        System.out.println(attributes.getValues()); // prints ["a"]
    }

}