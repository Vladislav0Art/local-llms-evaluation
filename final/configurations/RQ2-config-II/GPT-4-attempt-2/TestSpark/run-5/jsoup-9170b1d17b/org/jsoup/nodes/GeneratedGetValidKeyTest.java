package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetValidKeyTest {

    @Test
    public void getValidKeyTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertEquals("testValue", attr.get("testKey"));
    }

}