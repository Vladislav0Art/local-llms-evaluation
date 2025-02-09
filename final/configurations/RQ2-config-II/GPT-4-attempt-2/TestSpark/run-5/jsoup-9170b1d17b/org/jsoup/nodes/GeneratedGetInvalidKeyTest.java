package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetInvalidKeyTest {

    @Test
    public void getInvalidKeyTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertEquals("", attr.get("invalidKey"));
    }

}