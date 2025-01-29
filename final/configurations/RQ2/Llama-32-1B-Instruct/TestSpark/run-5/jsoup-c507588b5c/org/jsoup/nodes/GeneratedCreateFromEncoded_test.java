package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedCreateFromEncoded_test {

    @Test
    public void createFromEncoded_test() throws Exception {
        String encodedText = "Hello%20World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

}