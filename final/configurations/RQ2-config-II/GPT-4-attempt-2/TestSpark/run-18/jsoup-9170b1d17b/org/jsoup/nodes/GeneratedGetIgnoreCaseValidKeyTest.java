package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedGetIgnoreCaseValidKeyTest {

    @Test
    public void getIgnoreCaseValidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.getIgnoreCase("KEY"));
    }

}