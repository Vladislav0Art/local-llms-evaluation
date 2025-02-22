package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_NegativeOffset {

    @Test
    public void testSplitText_NegativeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

}