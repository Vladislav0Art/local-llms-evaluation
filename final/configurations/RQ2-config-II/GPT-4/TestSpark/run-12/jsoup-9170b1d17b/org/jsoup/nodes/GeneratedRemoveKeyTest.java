package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveKeyTest {

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();

        attrs.add("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

}