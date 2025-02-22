package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}