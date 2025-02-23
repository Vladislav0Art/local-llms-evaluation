package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Test");
        TextNode textNode2 = textNode.splitText(1);
        assertEquals("T", textNode.coreValue());
        assertEquals("est", textNode2.coreValue());
    }

}