package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestCreateFromEncodedReturnsTextNode {

    @Test
    public void testCreateFromEncodedReturnsTextNode() {
        String encodedText = "<p>Hello World</p>";
        TextNode node = NodeUtilscreateFromEncoded(encodedText);
        assertTrue(node instanceof TextNode);
    }

}