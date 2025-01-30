package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.putIgnoreCase("Key", "Value");
        assertEquals("Value", attr.get("Key"));
        attr.putIgnoreCase("KEY", "New Value");
        assertEquals("New Value", attr.get("Key"));
    }

}