package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);

        assertTrue(attributes.hasKey("key"));
        assertEquals("", attributes.get("key"));

        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

}