package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("testKey1", "testVal1");
        Attributes attributes2 = attributes1.clone();
        assertEquals(attributes1, attributes2);
    }

}