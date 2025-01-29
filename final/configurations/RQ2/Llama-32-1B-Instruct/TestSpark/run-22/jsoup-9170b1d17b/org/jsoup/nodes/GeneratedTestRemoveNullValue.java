package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRemoveNullValue {

    @Test
    public void testRemoveNullValue() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.remove(null));
        assertTrue(attrs.remove("test"));
    }

}