package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestTextNodeTrim {

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
    public void testTextNodeTrim() {
        TextNode node = new TextNode("   ");
        assertEquals("", node.text());
        assertTrue(node.isBlank());

        TextNode newNode = new TextNode("   ").splitText(0);
        assertSame(newNode, node.splitText(3));
        assertNotEquals(newNode, new TextNode(" "));
    }
}

public class StringUtil {

    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        return text.trim();
    }

}