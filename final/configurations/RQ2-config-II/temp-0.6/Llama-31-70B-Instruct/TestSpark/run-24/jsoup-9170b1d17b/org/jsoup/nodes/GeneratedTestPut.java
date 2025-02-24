package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

}