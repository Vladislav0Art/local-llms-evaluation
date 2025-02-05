package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedMergeSameKeyTest {

    @Test
    public void mergeSameKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key1", "value2");
        assertEquals(1, attributes.size());
        assertEquals("value2", attributes.get("key1"));
    }

}