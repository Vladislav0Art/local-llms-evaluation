package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attr = new Attributes();
        attr.add("Key", "Value");
        assertEquals("Value", attr.get("Key"));
    }

}