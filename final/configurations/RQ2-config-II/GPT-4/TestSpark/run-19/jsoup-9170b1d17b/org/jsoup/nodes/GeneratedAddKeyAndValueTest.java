package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedAddKeyAndValueTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        String actualValue = attrs.get("key");
        assertEquals("value", actualValue);
    }

}