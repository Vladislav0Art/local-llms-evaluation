package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");

        Attributes cloned = attrs.clone();
        assertEquals(attrs, cloned);
        assertNotSame(attrs, cloned);
    }

}