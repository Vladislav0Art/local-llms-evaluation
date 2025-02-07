package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        assertTrue(TextNode.class.getMethod("isBlank").invoke(new TextNode("Hello World ")));
        assertFalse(TextNode.class.getMethod("isBlank").invoke(new TextNode("   Hello World  ")));
        assertFalse(TextNode.class.getMethod("isBlank").invoke(new TextNode()));
    }

}