package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutKeyTest {

    @Test
    public void PutKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        assertEquals("value", value);
    }

}