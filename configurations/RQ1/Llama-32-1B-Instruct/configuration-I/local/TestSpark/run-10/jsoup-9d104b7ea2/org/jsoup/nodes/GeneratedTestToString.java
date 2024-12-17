package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Node parentNode = mock(Node);
        when(parentNode.getWholeText()).thenReturn("   \n  ");
        TextNode node = new TextNode("   \n  ");
        parentNode.addChildren(1, node);

        String expected = "   \n  ";
        assertEquals(expected, (TextNode) parentNode.addChild(1, node).toString());
    }

}