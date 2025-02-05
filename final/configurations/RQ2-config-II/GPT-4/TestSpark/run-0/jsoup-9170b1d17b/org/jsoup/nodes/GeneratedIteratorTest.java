package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        List<String> keys = new ArrayList<>();
        attributes.iterator().forEachRemaining(attr -> keys.add(attr.getKey()));
        assertTrue(keys.contains("key1"));
        assertTrue(keys.contains("key2"));
    }

}