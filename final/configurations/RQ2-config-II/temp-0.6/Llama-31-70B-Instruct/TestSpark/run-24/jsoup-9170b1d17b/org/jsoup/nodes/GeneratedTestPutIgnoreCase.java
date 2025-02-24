package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestPutIgnoreCase {

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

}