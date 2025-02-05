package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        assertTrue(attributes.equals(attributes1));
    }

}