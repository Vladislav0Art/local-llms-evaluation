package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedPutAttributeValueTest {

    @Test
    public void putAttributeValueTest() {
        Attributes attributes = new Attributes();
        Attribute attr = new Attribute("key", "value");
        attributes.put(attr);
        assertEquals("value", attributes.get("key"));
    }

}