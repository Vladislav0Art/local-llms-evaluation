package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        String text = "Text";
        TextNode textNode = new TextNode(text);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Text", accum.toString());
    }

}