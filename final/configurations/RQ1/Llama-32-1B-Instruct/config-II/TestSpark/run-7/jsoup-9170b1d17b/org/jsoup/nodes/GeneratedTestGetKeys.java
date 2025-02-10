package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetKeys {

    @Test
    public void testGetKeys() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        String[] keys = attributes.getKeys();

        for (String key : keys) {
            System.out.println(key);
        }
    }

}