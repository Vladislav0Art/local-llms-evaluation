package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", true);
        assertTrue(attrs.hasKey("key"));
        attrs.put("key", false);
        assertFalse(attrs.hasKey("key"));
    }

}