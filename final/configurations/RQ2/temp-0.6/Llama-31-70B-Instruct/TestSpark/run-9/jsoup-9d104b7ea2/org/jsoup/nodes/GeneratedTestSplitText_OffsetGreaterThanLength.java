package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_OffsetGreaterThanLength {

    @Test
    public void testSplitText_OffsetGreaterThanLength() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}