package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestRemoveInternalPrefix {

    @Test
    public void testRemoveInternalPrefix() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        System.out.println(attributes.getKey(key)); // Expected: test

        attributes.removeInternalPrefix(key);
        System.out.println(attributes.getKey(key)); // Expected: null
    }

}