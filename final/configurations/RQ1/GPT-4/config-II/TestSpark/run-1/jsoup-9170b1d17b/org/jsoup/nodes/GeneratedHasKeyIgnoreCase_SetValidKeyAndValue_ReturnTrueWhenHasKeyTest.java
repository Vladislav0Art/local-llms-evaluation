package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedHasKeyIgnoreCase_SetValidKeyAndValue_ReturnTrueWhenHasKeyTest {

    @Test
    public void hasKeyIgnoreCase_SetValidKeyAndValue_ReturnTrueWhenHasKeyTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        boolean result = instance.hasKeyIgnoreCase("TEST");
        assertTrue(result);
    }

}