package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attrs = new Attributes();

        attrs.add("key", "value");

        Attributes cloned = attrs.clone();

        assertEquals(attrs, cloned);
    }

}