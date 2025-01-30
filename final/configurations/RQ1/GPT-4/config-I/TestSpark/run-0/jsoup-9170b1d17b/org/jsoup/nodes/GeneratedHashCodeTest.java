package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        attributes1.add("key2", "value2");

        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");
        attributes2.add("key1", "value1");

        // The order of the attributes does not matter, so they should have the same hash code.
        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

}