package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNonEmptyTest {

    @Test
    public void equalsNonEmptyTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");

        assertEquals(attributes1, attributes2);
    }

}