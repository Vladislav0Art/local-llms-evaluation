package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedContainsKeyTest {

    @Test
    public void ContainsKeyTest() {
        Attributes attributes = new Attributes();
        boolean hasKey = attributes.hasKey("key");
        assertFalse(hasKey);

        attributes.put("key", "value");
        hasKey = attributes.hasKey("key");
        assertTrue(hasKey);
    }

}