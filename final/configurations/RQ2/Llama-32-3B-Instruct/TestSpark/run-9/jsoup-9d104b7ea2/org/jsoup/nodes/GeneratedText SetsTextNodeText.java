package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedText SetsTextNodeText {

    @Test
    public void text

    SetsTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.text("newText");
        assertEquals("newText", textNode.text());
    }

}