package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        TextNode newNode = textNode.splitText(2);
        assertEquals("Te", textNode.getWholeText());
        assertEquals("xt", newNode.getWholeText());
    }

}