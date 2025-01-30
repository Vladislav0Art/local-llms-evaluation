package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertNotNull(attributes.hashCode());
    }

}