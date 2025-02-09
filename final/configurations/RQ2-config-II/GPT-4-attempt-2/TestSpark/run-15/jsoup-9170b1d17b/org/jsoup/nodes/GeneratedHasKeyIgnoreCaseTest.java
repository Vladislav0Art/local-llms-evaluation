package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedHasKeyIgnoreCaseTest {

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
        assertFalse(attributes.hasKeyIgnoreCase("NONEXISTENTKEY"));
    }

}