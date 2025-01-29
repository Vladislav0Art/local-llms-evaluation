package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedOuterHtmlTail {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void outerHtmlTail() {
        // This test is currently failing due to the fact that the node has no innerHTML attribute.
        String originalText = "   Hello   World  ";
        TextNode node = new TextNode(originalText);
        assertEquals("<p>Hello <b>World</b></p>", node.outerHtml());
    }

}