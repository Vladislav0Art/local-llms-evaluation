package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        TextNode textNode = new TextNode("   \n\t\r\n  ");
        boolean result = lastCharIsWhitespace(new StringBuilder(textNode));
        assertTrue(result);
    }

}