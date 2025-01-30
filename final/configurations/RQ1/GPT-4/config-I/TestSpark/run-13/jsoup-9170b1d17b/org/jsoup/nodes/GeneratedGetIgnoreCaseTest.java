package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertEquals("Value", attr.getIgnoreCase("KEY"));
        assertEquals("", attr.getIgnoreCase("AnotherKey"));
    }

}