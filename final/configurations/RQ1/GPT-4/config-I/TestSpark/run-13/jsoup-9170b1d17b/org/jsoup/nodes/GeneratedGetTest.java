package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertEquals("Value", attr.get("Key"));
        assertEquals("", attr.get("AnotherKey"));
    }

}