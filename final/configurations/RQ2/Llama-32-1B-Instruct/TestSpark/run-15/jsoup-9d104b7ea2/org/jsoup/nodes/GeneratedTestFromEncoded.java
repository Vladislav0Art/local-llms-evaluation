package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestFromEncoded {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello,&#64;World!&#39;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
    }

}