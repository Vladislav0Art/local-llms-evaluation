package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedGetValidKeyTest {

    @Test
    public void getValidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

}