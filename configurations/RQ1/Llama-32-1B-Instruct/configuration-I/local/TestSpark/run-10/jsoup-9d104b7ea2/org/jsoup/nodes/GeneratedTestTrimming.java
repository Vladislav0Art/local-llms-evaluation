package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestTrimming {

    @Test
    public void testTrimming() {
        Node parentNode = mock(Node);
        TextNode node = new TextNode("   \n  ");
        parentNode.setWholeText("", true);
        when(node.text("   \n  ")).thenReturn("World");
        when(node.splitText(5)).thenReturn(new TextNode("World"));
        when(parentNode.addChildren(1, node)).thenReturn(node);

        Node expected = new TextNode("\n\nHello\nWorld");
        Node actual = parentNode.addChild(1, node);
        Assert.assertTrue(actual instanceof TextNode);
        Assert.assertEquals(expected, (TextNode) actual);
    }

}