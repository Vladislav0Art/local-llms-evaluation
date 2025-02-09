package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("This is the whole text");

        assertEquals("This is the whole text", textNode.getWholeText());
    }

}