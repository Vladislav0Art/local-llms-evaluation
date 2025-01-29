package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedStripLeadingWhitespace_text {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void stripLeadingWhitespace_text() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append("   ");
        }
        String originalText = "   Hello   World  ";
        TextNode node = new TextNode(originalText);
        assertEquals("Hello World", node.stripLeadingWhitespace(builder));
    }

}