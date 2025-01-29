package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutNullValueCaseInsensitive {

    @Test
    public void testPutNullValueCaseInsensitive() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.putIgnoreCase(null, "value"));
        assertFalse(attrs.hasKeyIgnoreCase(null));
        assertNull(attrs.getUserData(null));
    }

}