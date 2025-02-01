package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.normalize();
        assertFalse(attributes.hasKey("KEY"));
        assertTrue(attributes.hasKey("key"));
    }

}