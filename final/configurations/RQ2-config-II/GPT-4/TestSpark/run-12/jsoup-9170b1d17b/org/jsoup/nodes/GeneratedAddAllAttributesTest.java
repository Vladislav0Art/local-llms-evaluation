package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddAllAttributesTest {

    @Test
    public void addAllAttributesTest() {
        Attributes attrs = new Attributes();

        attrs.add("key1", "value1");
        attrs.add("key2", "value2");

        Attributes newAttrs = new Attributes();

        newAttrs.addAll(attrs);

        assertEquals(2, newAttrs.size());
        assertTrue(newAttrs.hasKey("key1"));
        assertTrue(newAttrs.hasKey("key2"));
    }

}