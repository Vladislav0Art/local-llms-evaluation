package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testTextNodesameName() {
        Node node = Mockito.mock(Node.class);
        Node expected = Mockito.mock(TextNode.class);

        when(node.getNodeName()).thenReturn("text");
        when(expected.getNodeName()).thenReturn("text");

        assertEquals(expected, node);
    }

    @Test
    public void testTextNodesameTextButDifferentNames() {
        Node node1 = Mockito.mock(Node.class);
        Node expected1 = Mockito.mock(TextNode.class);

        when(node1.getText()).thenReturn("");
        when(expected1.getText()).thenReturn("");

        assertEquals(expected1, node1);
    }

    @Test
    public void testTextNodesDifferentNames() {
        Node node1 = Mockito.mock(Node.class);
        Node node2 = Mockito.mock(TextNode.class);

        when(node1.getNodeName()).thenReturn("text");
        when(node2.getNodeName()).thenReturn("");

        assertEquals(null, node1);
        assertEquals(expected1, node2);
    }

    @Test
    public void testTextNodesDifferentTextButSameNames() {
        Node node1 = Mockito.mock(Node.class);
        Node expected1 = Mockito.mock(TextNode.class);

        when(node1.getText()).thenReturn("a");
        when(expected1.getText()).thenReturn("");

        assertEquals(expected1, node1);
    }

    @Test
    public void testTextNodesBlank() {
        Node node = Mockito.mock(Node.class);

        when(node.isBlank()).thenReturn(true);

        assertEquals(true, node.isBlank());
    }

    @Test
    public void testTextNodesNonBlank() {
        Node node = Mockito.mock(Node.class);

        when(node.isBlank()).thenReturn(false);

        assertEquals(false, node.isBlank());
    }

    @Test
    public void testSplitTextOffset() {
        Node node1 = Mockito.mock(TextNode.class);
        Node expected1 = Mockito.mock(TextNode.class);

        when(node1.splitText(0)).thenReturn(expected1);

        assertEquals(expected1, node1.splitText(0));
    }

}