package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributeTest {

    @Test
    public void RemoveAttributeTest() {
        Attributes attributes = new Attributes();

        attributes.put("key", "value");
        boolean hasKey = attributes.hasKey("key");
        assertTrue(hasKey);

        attributes.remove("key");
        hasKey = attributes.hasKey("key");
        assertFalse(hasKey);
    }

}