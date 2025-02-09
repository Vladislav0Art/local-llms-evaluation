package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String expected = " key=\"value\"";
        assertEquals(expected, attributes.toString());
    }

}