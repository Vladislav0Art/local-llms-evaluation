package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddKeyAndValueTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes attrs = new Attributes();

        attrs.add("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

}