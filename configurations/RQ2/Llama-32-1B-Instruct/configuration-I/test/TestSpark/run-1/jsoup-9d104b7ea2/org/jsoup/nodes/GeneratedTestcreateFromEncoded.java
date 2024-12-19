package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestcreateFromEncoded {

    @Test
    public void testcreateFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = new TextNode(createFromEncoded(encodedText));
        assertEquals(encodedText, getTextNode(node).getText());
    }

}