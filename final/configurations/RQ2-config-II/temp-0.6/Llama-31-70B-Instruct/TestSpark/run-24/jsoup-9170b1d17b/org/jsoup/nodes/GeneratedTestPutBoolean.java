package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestPutBoolean {

    @Test
    public void testPutBoolean() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", true);
        assertEquals("", attributes.get("testKey"));
    }

}