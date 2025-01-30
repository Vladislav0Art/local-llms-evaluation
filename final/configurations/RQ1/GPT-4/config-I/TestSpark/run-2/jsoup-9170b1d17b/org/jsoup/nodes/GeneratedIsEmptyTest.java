package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
        attrs.add("key", "value");
        assertFalse(attrs.isEmpty());
    }

}