package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   test   text with   multiple   whitespaces  ";
        assertEquals(" test text with multiple whitespaces ", TextNode.normaliseWhitespace(text));
    }

}