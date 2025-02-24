package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        assertTrue(attributes.hasKey("testKey"));
    }

}