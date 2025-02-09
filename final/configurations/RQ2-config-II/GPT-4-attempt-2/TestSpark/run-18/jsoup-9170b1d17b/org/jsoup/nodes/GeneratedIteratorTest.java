package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Iterator<Attribute> iter = attrs.iterator();
        assertTrue(iter.hasNext());
    }

}