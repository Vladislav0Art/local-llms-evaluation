package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        ParseSettings settings = new ParseSettings();
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int result = attributes.deduplicate(settings);
        assertTrue(result == 1 || result == 0);
    }

}