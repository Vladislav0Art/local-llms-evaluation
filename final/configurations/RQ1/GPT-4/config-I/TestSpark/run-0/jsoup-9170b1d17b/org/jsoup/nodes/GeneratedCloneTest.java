package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = attributes1.clone();

        assertNotSame(attributes1, attributes2);
        assertTrue(attributes1.equals(attributes2));
    }

}