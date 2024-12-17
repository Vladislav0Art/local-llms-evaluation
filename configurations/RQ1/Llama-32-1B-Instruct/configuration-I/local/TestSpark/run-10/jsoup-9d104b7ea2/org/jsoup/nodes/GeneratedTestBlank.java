package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestBlank {

    @Test
    public void testBlank() {
        Node parentNode = mock(Node);
        TextNode node = new TextNode("   \n  ");
        whenparentNode.getWholeText()).thenReturn("");
        when(node.text("   \n  ")).thenReturn("");
        when(parentNode.getWholeText()).thenReturn("");
        assertNodeIsBlank(node, parentNode);
    }

}