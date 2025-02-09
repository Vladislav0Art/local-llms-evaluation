package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        Attributes result = attributes.put("key", true);
        assertEquals("", result.get("key"));
    }

}