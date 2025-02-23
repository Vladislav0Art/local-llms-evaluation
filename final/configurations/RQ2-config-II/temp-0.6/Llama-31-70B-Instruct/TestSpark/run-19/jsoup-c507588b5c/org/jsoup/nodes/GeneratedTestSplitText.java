package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splittedNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splittedNode.getWholeText());
    }

}