package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeOuterHtmlTail {

    @Test
    public void testTextNodeOuterHtmlTail() throws IOException {
        String text = "";
        TestTextNodeNode node = new TextNodeNode(text, "");
        assertEquals("", node.outerHtmlTail(null, 0, null).trim());
    }
}

class TextNodeNode {
    private final String text;
    private final String name;

    public TextNodeNode(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public static TestTextNodeNode createFromEncoded(String encodedText) {
        // implementation
    }

    @Override
    public String toString() {
        return "TextNode{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}