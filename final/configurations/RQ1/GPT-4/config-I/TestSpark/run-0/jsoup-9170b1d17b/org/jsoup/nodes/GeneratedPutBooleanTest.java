package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();

        assertFalse(attributes.hasKey("key"));

        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));

        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

}