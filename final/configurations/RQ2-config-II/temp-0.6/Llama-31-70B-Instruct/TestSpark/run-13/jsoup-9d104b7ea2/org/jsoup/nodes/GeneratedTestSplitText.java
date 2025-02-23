package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("te", textNode.coreValue());
        assertEquals("st", newTextNode.coreValue());
    }

}