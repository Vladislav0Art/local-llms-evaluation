package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddKeyValueTest {

    @Test
    public void addKeyValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}