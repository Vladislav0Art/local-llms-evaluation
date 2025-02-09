package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributeTest {

    @Test
    public void addAttributeTest() {
        Attributes attr = new Attributes();
        attr.add("testKey", "testValue");
        assertEquals("testValue", attr.get("testKey"));
    }

}