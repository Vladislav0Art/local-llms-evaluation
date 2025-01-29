package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}