package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        assertEquals("testValue", attributes.get("testKey"));
    }

}