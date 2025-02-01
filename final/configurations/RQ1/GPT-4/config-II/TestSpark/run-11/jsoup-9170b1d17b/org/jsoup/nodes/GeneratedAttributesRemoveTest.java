package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesRemoveTest {

    @Test
    public void attributesRemoveTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        assertEquals("", attributes.get("key"));
    }

}