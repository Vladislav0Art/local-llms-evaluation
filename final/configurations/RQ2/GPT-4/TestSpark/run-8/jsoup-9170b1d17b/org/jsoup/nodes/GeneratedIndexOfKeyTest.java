package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static junit.framework.TestCase.*;

public class GeneratedIndexOfKeyTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        int index = attributes.indexOfKey("key1");
        assertEquals(0, index);
    }

}