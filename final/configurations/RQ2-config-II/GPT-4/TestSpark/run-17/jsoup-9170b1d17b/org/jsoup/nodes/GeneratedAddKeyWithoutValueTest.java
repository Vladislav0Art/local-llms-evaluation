package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddKeyWithoutValueTest {

    @Test
    public void addKeyWithoutValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", null);
        assertTrue(attrs.hasKey("key"));
    }

}