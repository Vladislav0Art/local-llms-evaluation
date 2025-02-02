package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeWithMultipleCharacters {

    @Test
    public void testTextNodeWithMultipleCharacters() {
        String input = "hello";
        TextNode textNode = new TextNode(input);
        assertEquals("{\"text\": \"hello\", \"length\": 5}", textNode.toString());
    }

}