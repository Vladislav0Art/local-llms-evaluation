package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   Hello,    World!  ";
        String normalised = TextNode.normaliseWhitespace(text);
        assertEquals(" Hello, World! ", normalised);
    }

}