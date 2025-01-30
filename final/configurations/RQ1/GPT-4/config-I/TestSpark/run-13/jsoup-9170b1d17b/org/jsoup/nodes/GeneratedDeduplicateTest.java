package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attr = new Attributes();
        attr.add("Key", "Value1");
        attr.add("key", "Value2");
        assertEquals(1, attr.deduplicate(ParseSettings.preserveCase));
    }

}