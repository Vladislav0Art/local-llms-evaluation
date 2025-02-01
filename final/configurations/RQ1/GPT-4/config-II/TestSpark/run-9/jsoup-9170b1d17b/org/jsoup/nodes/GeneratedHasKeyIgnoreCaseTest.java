package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedHasKeyIgnoreCaseTest {

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");

        assertTrue(attributes.hasKeyIgnoreCase("key"));
        assertFalse(attributes.hasKeyIgnoreCase("unavailableKey"));
    }

}