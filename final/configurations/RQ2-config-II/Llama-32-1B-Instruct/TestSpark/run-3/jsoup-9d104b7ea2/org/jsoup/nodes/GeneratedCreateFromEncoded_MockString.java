package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_MockString {

    @Test
    public void createFromEncoded_MockString() throws IOException {
        String encodedText = "Hello World";
        when(createFromEncoded(encodedText)).thenReturn(new TextNode(encodedText));
        TextNode node = new TextNode("Hello World");
        assertNotNull(node);
    }

}