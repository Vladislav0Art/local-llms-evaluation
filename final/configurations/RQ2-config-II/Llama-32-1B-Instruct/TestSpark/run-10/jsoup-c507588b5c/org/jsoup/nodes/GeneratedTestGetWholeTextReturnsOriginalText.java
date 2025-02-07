package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestGetWholeTextReturnsOriginalText {

    @Test
    public void testGetWholeTextReturnsOriginalText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node getWholeText());
    }

}