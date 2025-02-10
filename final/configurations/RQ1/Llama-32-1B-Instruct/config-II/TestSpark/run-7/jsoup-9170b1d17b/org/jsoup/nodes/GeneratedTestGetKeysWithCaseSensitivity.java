package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetKeysWithCaseSensitivity {

    @Test
    public void testGetKeysWithCaseSensitivity() {
        Attributes attributes = new Attributes();
        attributes.set("A", "1");
        attributes.set("B", 2);

        String[] keys = attributes.getKeys();

        for (String key : keys) {
            System.out.println(key);
        }
    }

}