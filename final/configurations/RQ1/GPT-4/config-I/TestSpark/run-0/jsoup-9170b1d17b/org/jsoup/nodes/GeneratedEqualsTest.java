package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");

        assertTrue(attributes1.equals(attributes2));

        attributes2.add("anotherKey", "anotherValue");
        assertFalse(attributes1.equals(attributes2));
    }

}