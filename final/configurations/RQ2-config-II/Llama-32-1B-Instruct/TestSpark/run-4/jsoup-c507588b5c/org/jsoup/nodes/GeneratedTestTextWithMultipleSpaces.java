package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestTextWithMultipleSpaces {

    @Test
    public void testTextWithMultipleSpaces() {
        assertEquals("Hello  World ", TextNode.class.getMethod("text").invoke(new TextNode("Hello   World ")));
    }

}