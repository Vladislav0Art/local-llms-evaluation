package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestcreateFromEncoded {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testcreateFromEncoded() {
        String encodedText = "Hello World";
        TextNode result = textNode.createFromEncoded(encodedText);
        assertEquals("Hello World", result.getText());
    }

}