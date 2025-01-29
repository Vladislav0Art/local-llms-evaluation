package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestTextFromString {

    @Test
    public void testTextFromString() {
        String text = "test";
        TextNode node = new TextNode(text);
        String result = node.text();
        assertEquals("test", result);
    }

}