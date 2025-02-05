package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedDeduplicateWithSettingsTest {

    @Test
    public void deduplicateWithSettingsTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("KEY", "value");

        ParseSettings settings = new ParseSettings(true, false);
        int deduplicated = attributes.deduplicate(settings);

        assertEquals(1, deduplicated);
    }

}