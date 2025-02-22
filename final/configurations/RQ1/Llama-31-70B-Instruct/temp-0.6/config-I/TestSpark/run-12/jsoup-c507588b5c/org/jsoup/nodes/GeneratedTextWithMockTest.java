package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextWithMockTest {

    @Test
    public void textWithMockTest() {
        TextNode node = Mockito.mock(TextNode.class);
        Mockito.when(node.text()).thenReturn("This is a text node");
        assertEquals("This is a text node", node.text());
    }

}