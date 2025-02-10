package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestSet {

    @Test
    public void testSet() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");

        String key1 = internalKey("a");
        boolean value1 = attributes.getValue(key1);

        System.out.println(value1); // prints 1

        attributes.remove(key1);
        String key2 = internalKey("b");
        if (attributes.hasKey(key2)) {
            attributes.remove(key2);
        }
    }

}