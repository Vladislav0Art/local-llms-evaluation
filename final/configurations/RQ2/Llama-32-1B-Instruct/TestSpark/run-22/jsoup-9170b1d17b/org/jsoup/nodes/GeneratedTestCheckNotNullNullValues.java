package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCheckNotNullNullValues {

    @Test
    public void testCheckNotNullNullValues() {
        Attributes attrs = new Attributes();
        assertTrue(Attributes.checkNotNull("test"));
        assertFalse(Attributes.checkNotNull(null));
    }

}