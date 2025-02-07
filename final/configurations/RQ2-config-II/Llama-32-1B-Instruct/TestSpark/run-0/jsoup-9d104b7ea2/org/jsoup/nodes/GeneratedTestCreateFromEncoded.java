package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() throws Exception {
        // Assuming createFromString method is a real method of the class under test
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("HELLO WORLD", textNode.text());
    }

}