package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedPutKeyValueIsNullTest {

    @Test
    public void putKeyValueIsNullTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "null");
        assertTrue(attributes.hasKey("key"));
    }

}