package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedHasNonExistentKeyTest {

    @Test
    public void hasNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey("key"));
    }

}