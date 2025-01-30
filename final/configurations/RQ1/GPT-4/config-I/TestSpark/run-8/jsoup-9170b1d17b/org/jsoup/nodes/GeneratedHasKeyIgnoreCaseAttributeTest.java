package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedHasKeyIgnoreCaseAttributeTest {

    @Test
    public void hasKeyIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        assertTrue(attributes.hasKeyIgnoreCase("key"));
    }

}