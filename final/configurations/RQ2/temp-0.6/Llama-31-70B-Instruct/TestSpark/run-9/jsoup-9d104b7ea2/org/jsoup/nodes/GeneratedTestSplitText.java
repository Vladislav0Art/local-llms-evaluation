package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", textNode2.getWholeText());
    }

}