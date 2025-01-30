package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Iterator<Attribute> i = attrs.iterator();
        while (i.hasNext()) {
            Attribute attr = i.next();
            assertEquals("key", attr.getKey());
        }
    }

}