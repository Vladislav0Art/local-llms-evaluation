package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "value2");
        ParseSettings parseSettings = new ParseSettings(false, true);
        int removed = attributes.deduplicate(parseSettings);
        assertEquals(1, removed);
    }

}