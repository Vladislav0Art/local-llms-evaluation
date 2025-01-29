package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetIgnoreCaseNullValues {

    @Test
    public void testGetIgnoreCaseNullValues() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("test").toString());
        assertNull(attrs.getUserData("test"));
    }

}