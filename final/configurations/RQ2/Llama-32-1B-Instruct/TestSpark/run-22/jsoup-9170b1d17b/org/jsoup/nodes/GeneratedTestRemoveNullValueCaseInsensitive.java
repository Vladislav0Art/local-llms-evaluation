package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRemoveNullValueCaseInsensitive {

    @Test
    public void testRemoveNullValueCaseInsensitive() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase(null));
        assertTrue(attrs.remove("non-existing-key"));
    }

}