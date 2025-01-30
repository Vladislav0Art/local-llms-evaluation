package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedPutAttributeFromObjectTest {

    @Test
    public void putAttributeFromObjectTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        assertTrue(attributes.hasKey(attribute.getKey()));
    }

}