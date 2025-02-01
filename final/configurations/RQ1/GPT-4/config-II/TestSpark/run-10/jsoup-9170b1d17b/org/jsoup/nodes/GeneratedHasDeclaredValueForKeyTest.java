package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void HasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        boolean hasValue = attributes.hasDeclaredValueForKey("key");
        assertFalse(hasValue);

        attributes.put("key", "value");
        hasValue = attributes.hasDeclaredValueForKey("key");
        assertTrue(hasValue);
    }

}