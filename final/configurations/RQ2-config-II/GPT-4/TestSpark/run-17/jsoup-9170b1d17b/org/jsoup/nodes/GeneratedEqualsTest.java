package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key", "value");
        Attributes attrs2 = new Attributes();
        attrs2.add("key", "value");
        assertTrue(attrs1.equals(attrs2));
    }

}