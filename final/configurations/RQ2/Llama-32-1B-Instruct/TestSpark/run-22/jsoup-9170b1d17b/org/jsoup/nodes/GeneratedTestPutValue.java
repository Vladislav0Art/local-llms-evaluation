package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutValue {

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.put("test", "value");
        assertEquals("value", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

}