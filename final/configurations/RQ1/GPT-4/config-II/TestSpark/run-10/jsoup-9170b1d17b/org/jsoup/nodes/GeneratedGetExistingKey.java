package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetExistingKey {

    @Test
    public void GetExistingKey() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String value = attributes.get("key");
        assertEquals("value", value);
    }

}