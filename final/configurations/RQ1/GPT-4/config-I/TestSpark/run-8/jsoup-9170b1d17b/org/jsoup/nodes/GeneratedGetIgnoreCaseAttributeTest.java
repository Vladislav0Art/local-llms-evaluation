package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseAttributeTest {

    @Test
    public void getIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

}