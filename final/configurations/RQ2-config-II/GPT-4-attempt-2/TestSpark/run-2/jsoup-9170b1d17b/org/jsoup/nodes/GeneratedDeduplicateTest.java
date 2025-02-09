package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        ParseSettings settings = ParseSettings.htmlDefault;
        int deduplicateCount = attributes.deduplicate(settings);
        assertEquals(1, deduplicateCount);
    }

}