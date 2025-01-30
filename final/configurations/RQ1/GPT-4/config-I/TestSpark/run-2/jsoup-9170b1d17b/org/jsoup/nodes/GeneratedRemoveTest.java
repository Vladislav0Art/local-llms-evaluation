package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

}