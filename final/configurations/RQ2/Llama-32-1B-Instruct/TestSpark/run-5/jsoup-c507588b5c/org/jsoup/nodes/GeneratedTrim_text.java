package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTrim_text {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void trim_text() {
        String originalText = "   Hello   World  ";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.trim());
    }

}