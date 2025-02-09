package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedPutKeyValueTest {

    @Test
    public void putKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

}