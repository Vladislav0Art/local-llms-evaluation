package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals("value", attrs.get("key"));
    }

}