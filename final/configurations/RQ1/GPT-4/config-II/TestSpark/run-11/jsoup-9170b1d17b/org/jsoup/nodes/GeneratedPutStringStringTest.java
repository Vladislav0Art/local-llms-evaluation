package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutStringStringTest {

    @Test
    public void putStringStringTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}