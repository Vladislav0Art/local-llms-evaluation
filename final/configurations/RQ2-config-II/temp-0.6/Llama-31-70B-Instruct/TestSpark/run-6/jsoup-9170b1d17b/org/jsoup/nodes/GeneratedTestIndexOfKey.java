package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTestIndexOfKey {

    @Test
    public void testIndexOfKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        int indexOfKey = attributes.indexOfKey("key");
        assertEquals(0, indexOfKey);
    }

}