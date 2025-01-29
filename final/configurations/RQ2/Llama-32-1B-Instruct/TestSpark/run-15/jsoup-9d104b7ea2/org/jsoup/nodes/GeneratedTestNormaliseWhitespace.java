package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        TextNode node = new TextNode("   Hello, World!   ");
        String normalizedText = node.normaliseWhitespace();
        assertEquals("&nbsp;Hello,&amp; World!", normalizedText);
    }

}