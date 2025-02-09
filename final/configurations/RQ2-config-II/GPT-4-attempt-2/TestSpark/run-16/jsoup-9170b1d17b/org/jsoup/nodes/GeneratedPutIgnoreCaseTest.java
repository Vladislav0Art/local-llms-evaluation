package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("KEY", "value");
        assertEquals("value", attributes.get("key"));
    }

}