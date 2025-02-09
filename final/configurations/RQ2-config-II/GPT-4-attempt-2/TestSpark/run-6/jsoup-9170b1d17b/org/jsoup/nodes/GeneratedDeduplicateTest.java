package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes att = new Attributes();
        att.put("Key", "value1");
        att.put("key", "value2");
        att.deduplicate(ParseSettings.preserveCase);
        assertEquals(1, att.size());
    }

}