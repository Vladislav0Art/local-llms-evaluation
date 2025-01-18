package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        Attributes returnedAttributes = attributes.add("key", "value");

        assertEquals(attributes, returnedAttributes);
        assertEquals("value", attributes.get("key"));
    }

}