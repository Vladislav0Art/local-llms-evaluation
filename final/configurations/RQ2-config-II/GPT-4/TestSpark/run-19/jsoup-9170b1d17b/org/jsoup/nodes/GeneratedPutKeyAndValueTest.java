package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedPutKeyAndValueTest {

    @Test
    public void putKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        String actualValue = attrs.get("key");
        assertEquals("value", actualValue);
    }

}