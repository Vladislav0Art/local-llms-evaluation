package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetNullValue {

    @Test
    public void testGetNullValue() {
        Attributes attrs = new Attributes();
        assertEquals("test", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

}