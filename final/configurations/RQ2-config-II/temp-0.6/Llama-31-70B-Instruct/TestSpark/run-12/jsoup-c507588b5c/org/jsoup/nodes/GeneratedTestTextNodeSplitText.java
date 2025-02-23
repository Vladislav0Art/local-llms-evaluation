package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestTextNodeSplitText {

    @Test
    public void testTextNodeSplitText() {
        TextNode node = new TextNode("Test");
        TextNode tailNode = node.splitText(2);
        assertEquals("Te", node.coreValue());
        assertEquals("st", tailNode.coreValue());
    }

}