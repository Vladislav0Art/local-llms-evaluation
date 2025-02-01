package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesNotEqualTest {

    @Test
    public void attributesNotEqualTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");
        assertFalse(attributes1.equals(attributes2));
    }

}