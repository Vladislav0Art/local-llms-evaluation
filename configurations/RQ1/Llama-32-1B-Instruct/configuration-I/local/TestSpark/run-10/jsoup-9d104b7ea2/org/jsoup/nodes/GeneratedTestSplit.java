package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestSplit {

    @Test
    public void testSplit() {
        Node parentNode = mock(Node);
        String text = "Hello World";
        whenparentNode.getWholeText()).thenReturn(text);
        TextNode node = new TextNode(splitText(5));
        parentNode.addChildren(1, node);
        when(node.text("Hello World")).thenReturn("World");
        when(node.splitText(5)).thenReturn(new TextNode("World"));
        when(parentNode.addChildren(1, node)).thenReturn(node);

        Node expected = new TextNode("\n\nHello\n  World");
        Node actual = parentNode.addChild(1, node);
        Assert.assertTrue(actual instanceof TextNode);
        Assert.assertEquals(expected, (TextNode) actual);
    }

}