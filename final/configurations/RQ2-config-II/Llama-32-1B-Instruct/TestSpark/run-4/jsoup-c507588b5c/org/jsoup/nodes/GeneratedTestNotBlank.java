package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestNotBlank {

    @Test
    public void testNotBlank() {
        assertEquals("Hello World", TextNode.class.getMethod("isBlank").invoke(new TextNode("Hello World ")));
    }

}