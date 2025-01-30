package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();

        assertEquals(0, attributes.size());

        attributes.add("key1", "value1");
        assertEquals(1, attributes.size());

        attributes.add("key2", "value2");
        assertEquals(2, attributes.size());
    }

}