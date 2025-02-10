package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveKeyWithCaseSensitivity {

    @Test
    public void testRemoveKeyWithCaseSensitivity() {
        Attributes attributes = new Attributes();
        attributes.set("A", "1");
        attributes.set("B", 2);

        String key = internalKey("b");

        if (attributes.hasValue(key)) {
            attributes.remove(key);
        }

        System.out.println(attributes.getKeys()); // prints ["a"]
    }

}