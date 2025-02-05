package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        attrs.add("key", "value");
        int dedupCount = attrs.deduplicate(ParseSettings.preserveCase);
        assertEquals(1, dedupCount);
    }

}