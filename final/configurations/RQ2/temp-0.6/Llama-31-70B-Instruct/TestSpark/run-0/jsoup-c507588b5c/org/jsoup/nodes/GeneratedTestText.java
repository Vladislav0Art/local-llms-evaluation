package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}