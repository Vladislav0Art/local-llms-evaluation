package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedPutValidKeyAndValueTest {

    @Test
    public void putValidKeyAndValueTest() {
        Attributes attrs = new Attributes();

        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
        assertEquals("value", attrs.get("key"));
    }

}