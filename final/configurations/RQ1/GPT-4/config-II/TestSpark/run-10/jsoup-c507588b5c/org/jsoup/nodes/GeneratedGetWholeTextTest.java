package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("whole text");
        assertEquals("whole text", textNode.getWholeText());
    }

}