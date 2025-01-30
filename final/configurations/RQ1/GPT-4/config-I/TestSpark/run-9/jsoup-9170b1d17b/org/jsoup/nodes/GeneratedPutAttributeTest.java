package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("testKey3", "testVal3");
        attributes.put(attribute);
        assertTrue(attributes.hasKey("testKey3"));
    }

}