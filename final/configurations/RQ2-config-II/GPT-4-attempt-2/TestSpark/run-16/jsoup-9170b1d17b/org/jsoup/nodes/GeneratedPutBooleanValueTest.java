package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutBooleanValueTest {

    @Test
    public void putBooleanValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertEquals("", attributes.get("key"));
    }

}