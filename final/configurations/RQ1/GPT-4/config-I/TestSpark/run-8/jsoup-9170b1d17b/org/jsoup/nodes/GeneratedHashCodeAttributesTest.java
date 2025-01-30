package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedHashCodeAttributesTest {

    @Test
    public void hashCodeAttributesTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key", "value");
        attributes2.put("key", "value");
        attributes1.hashCode();
        attributes2.hashCode();
    }

}