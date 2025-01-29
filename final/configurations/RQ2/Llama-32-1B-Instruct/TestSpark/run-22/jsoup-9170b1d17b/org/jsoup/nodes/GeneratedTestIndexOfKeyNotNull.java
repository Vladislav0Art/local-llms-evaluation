package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestIndexOfKeyNotNull {

    @Test
    public void testIndexOfKeyNotNull() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.indexOfKey("test") != -1);
        assertEquals(0, attrs.indexOfKey("test"));
    }

}