package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

}