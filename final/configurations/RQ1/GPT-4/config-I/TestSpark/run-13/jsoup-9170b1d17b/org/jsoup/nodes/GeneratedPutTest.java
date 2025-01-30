package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertEquals("Value", attr.get("Key"));
        attr.put("Key", "New Value");
        assertEquals("New Value", attr.get("Key"));
    }

}