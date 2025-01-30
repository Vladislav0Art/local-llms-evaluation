package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();

        assertTrue(attributes.isEmpty());

        attributes.add("key", "value");
        assertFalse(attributes.isEmpty());
    }

}