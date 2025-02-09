package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        assertTrue(attributes.hasKey("key"));
    }

}