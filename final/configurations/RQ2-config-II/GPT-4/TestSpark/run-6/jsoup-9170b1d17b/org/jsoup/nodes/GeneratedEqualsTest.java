package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("key1", "value1");

        assertTrue(attributes1.equals(attributes2));
    }

}