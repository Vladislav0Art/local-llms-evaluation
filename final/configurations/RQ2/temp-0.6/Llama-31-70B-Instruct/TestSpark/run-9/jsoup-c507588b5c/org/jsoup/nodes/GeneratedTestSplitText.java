package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", textNode2.getWholeText());
    }

}