package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedAddKeyValueTest {

    @Test
    public void addKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals("value", attrs.get("key"));
    }

}