package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        attrs.put("key1", "value");
        attrs.put("key2", "value");
        assertEquals(2, attrs.size());
    }

}