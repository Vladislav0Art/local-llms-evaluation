package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        assertEquals("Hello World", TextNode.class.getMethod("getWholeText").invoke(new TextNode("Hello World")));
    }

}