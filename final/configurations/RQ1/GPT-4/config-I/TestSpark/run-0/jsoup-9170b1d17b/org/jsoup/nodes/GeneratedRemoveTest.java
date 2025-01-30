package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();

        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));

        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

}