package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String expected = "{\"key\":\"value\"}";
        assertEquals(expected, attributes.toString());
    }

}