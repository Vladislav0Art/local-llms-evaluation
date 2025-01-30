package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedHasDeclaredValueForKeyIgnoreCaseAttributeTest {

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("key"));
    }

}