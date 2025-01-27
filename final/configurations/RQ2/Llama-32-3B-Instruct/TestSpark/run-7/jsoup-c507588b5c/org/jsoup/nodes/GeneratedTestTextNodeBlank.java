package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestTextNodeBlank {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public boolean isBlank() {
        return text.trim().isEmpty();
    }

    public void splitText(int offset) {
        // implementation
    }
}

public class TestTextNode {

    @Test
    public void testTextNodeBlank() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
        assertTrue(node.isBlank());

        TextNode newNode = new TextNode("");
        assertSame(newNode, node.splitText(0));
        assertNotEquals(newNode, new TextNode(" "));
    }

}