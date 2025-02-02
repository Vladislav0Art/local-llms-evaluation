package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeWithSingleCharacter {

    @Test
    public void testTextNodeWithSingleCharacter() {
        String input = "a";
        TextNode textNode = new TextNode(input);
        assertEquals("{\"text\": \"a\", \"length\": 1}", textNode.toString());
    }

}