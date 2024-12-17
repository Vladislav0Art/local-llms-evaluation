package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestToStringTrimming {

    @Test
    public void testToStringTrimming() {
        Node parentNode = mock(Node);
        when(parentNode.getWholeText()).thenReturn("");
        TextNode node = new TextNode("   \n  ");
        parentNode.addChildren(1, node);

        String expected = "";
        assertEquals(expected, (TextNode) parentNode.addChild(1, node).toString());
    }

}