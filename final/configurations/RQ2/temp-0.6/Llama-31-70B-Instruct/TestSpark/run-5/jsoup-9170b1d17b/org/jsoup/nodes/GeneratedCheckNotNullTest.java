package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.checkNotNull(""));
        assertEquals("value", attributes.checkNotNull("value"));
    }

}