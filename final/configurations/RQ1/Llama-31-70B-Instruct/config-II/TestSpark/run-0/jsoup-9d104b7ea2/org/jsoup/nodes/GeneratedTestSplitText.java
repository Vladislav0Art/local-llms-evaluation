package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitTextNode.getWholeText());
    }

}