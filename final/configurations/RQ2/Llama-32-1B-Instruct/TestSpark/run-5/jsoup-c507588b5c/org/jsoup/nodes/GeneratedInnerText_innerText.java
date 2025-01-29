package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedInnerText_innerText {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void innerText_innerText() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertEquals("Hello World", node.innerText());
    }

}