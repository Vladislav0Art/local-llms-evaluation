package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void textTestsTextNode_text() {
        TextNode node = new TextNode();
        when(node.text()).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void textTestsTextNode_text() {
        TextNode node = new TextNode("");
        when(node.text()).thenReturn("");
        assertEquals("", node.text());
    }

    @Test
    public void getWholeTextTestsTextNode_getWholeText() {
        TextNode node = new TextNode("Hello, World!");
        when(node.getWholeText()).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.getWholeText());
    }

    @Test
    public void splitTextTestsTextNode_splitText() {
        TextNode node = new TextNode("Hello, World!");
        when(node.splitText(0)).thenReturn(new TextNode(""));
        assertEquals(new TextNode(""), node.splitText(0));
    }

}