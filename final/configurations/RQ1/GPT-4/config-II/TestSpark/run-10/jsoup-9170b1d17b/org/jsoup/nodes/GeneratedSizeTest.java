package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSizeTest {

    @Test
    public void SizeTest() {
        Attributes attributes = new Attributes();

        int size = attributes.size();
        assertEquals(0, size);

        attributes.put("key", "value");
        size = attributes.size();
        assertEquals(1, size);
    }

}