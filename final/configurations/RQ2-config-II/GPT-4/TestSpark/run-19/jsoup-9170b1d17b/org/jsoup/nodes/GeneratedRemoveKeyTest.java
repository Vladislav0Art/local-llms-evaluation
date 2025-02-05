package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveKeyTest {

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

}