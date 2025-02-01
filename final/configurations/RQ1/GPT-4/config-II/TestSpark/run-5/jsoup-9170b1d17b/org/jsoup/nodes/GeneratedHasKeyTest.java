package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey("key"));

        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

}