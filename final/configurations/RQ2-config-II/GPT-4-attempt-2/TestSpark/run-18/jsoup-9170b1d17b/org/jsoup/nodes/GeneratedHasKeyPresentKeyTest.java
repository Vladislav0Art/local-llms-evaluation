package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedHasKeyPresentKeyTest {

    @Test
    public void hasKeyPresentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

}