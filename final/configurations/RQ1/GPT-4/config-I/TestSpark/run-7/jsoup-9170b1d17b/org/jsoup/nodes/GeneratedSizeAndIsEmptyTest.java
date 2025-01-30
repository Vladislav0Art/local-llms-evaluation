package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedSizeAndIsEmptyTest {

    @Test
    public void sizeAndIsEmptyTest() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
        assertTrue(attributes.isEmpty());

        attributes.put("key", "value");
        assertEquals(1, attributes.size());
        assertFalse(attributes.isEmpty());
    }

}