package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedToStingTest {

    @Test
    public void toStingTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("key1=\"value1\"", attributes.toString());
    }

}