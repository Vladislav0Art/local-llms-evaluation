package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutNullValue {

    @Test
    public void testPutNullValue() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.put(null, "value"));
        assertFalse(attrs.hasKey(null));
        assertNull(attrs.getUserData(null));
    }

}