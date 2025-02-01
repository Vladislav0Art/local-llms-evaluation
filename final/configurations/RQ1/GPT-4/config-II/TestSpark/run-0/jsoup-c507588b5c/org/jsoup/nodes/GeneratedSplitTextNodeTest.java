package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextNodeTest {

    @Test
    public void splitTextNodeTest() {
        String testString = "Test String";
        int offset = 4;
        TextNode textNode = new TextNode(testString);
        TextNode split = textNode.splitText(offset);
        assertEquals("Test", textNode.getWholeText());
        assertEquals(" String", split.getWholeText());
    }

}