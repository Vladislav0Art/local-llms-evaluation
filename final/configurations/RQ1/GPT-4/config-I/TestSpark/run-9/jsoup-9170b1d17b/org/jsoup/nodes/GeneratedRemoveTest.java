package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.remove("testKey1");
        assertFalse(attributes.hasKey("testKey1"));
    }

}