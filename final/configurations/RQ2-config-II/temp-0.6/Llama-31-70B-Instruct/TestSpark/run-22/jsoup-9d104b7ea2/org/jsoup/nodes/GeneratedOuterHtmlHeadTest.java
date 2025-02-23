package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("text");
        StringBuilder accum = new StringBuilder();
        int depth = 2;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("  text", accum.toString());
    }

}