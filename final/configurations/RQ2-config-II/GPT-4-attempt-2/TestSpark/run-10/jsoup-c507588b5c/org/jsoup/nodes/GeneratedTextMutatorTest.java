package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTextMutatorTest {

    @Test
    public void textMutatorTest() {
        String text = "sample text";
        String newText = "new text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}