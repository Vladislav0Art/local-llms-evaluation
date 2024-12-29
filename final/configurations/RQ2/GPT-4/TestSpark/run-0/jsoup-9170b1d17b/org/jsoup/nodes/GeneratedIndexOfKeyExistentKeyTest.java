package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedIndexOfKeyExistentKeyTest {

    @Test
    public void indexOfKeyExistentKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existent", "value");
        assertEquals(0, attributes.indexOfKey("existent"));
    }

}