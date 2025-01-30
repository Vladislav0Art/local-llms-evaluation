package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.add("testKey2", "testVal2");
        assertEquals(2, attributes.asList().size());
    }

}