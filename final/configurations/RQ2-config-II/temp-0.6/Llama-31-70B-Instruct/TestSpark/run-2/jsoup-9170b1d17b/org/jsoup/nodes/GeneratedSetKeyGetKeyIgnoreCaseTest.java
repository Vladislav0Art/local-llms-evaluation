package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class GeneratedSetKeyGetKeyIgnoreCaseTest {

    @Test
    public void setKeyGetKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");

        assertEquals("Value1", attributes.getIgnoreCase("key1"));
    }

}