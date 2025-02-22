package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);

        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("test", accum.toString());
    }

}