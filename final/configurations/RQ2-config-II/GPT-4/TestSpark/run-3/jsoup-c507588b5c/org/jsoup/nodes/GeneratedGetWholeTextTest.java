package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test Text Node");
        String wholeText = textNode.getWholeText();
        assertEquals("Test Text Node", wholeText);
    }

}