package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertNotNull(attributes.getIgnoreCase("KEY"));
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

}