package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.add("testKey1", "testVal1");
        attributes2.add("testKey2", "testVal2");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

}