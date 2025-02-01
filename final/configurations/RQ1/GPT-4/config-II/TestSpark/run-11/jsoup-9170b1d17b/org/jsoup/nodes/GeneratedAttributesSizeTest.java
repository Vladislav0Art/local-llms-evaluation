package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesSizeTest {

    @Test
    public void attributesSizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

}