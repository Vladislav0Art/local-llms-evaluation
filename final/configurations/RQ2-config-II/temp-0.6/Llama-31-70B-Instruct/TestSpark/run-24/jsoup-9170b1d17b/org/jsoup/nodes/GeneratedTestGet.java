package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

}