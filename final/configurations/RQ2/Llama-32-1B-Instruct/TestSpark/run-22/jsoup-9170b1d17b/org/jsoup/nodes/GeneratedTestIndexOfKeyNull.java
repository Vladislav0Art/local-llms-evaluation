package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestIndexOfKeyNull {

    @Test
    public void testIndexOfKeyNull() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.indexOfKey(null));
        assertEquals(-1, attrs.indexOfKey(null));
    }

}