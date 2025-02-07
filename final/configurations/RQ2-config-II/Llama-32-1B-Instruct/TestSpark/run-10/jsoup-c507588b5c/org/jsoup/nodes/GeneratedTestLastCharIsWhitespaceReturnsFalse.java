package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestLastCharIsWhitespaceReturnsFalse {

    @Test
    public void testLastCharIsWhitespaceReturnsFalse() {
        TextNode node = new TextNode("Hello");
        assertTrue(!node.lastCharIsWhitespace(new StringBuilder()));
    }

}