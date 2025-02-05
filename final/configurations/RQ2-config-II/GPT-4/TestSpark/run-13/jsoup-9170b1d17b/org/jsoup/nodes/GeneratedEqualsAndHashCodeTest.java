package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedEqualsAndHashCodeTest {

    @Test
    public void equalsAndHashCodeTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.put("key", "value");
        attributes2.put("key", "value");

        assertTrue(attributes1.equals(attributes2) && attributes2.equals(attributes1));
        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

}