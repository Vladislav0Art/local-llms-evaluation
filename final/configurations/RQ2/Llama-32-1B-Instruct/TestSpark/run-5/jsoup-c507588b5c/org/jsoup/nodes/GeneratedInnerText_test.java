package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedInnerText_test {

    @Test
    public void innerText_test() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertEquals("Hello World", node innerText());
    }

}