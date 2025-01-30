package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        ParseSettings settings = ParseSettings.preserveCase;
        Attributes attributes1 = new Attributes();
        attributes1.add("Key", "value1");
        attributes1.add("key", "value2");

        assertEquals(2, attributes1.deduplicate(settings));

        Attributes attributes2 = new Attributes();
        attributes2.add("Key", "value1");
        attributes2.add("key", "value2");

        settings = ParseSettings.htmlDefault;
        assertEquals(1, attributes2.deduplicate(settings));
    }

}