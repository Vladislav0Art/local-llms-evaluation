package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedIndexOfKeyNonExistentKeyTest {

    @Test
    public void indexOfKeyNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("non-existent"));
    }

}