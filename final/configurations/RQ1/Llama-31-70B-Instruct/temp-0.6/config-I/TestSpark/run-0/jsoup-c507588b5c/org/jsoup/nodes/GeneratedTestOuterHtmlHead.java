package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Testing");
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);

        textNode.outerHtmlHead(accum, 0, out);

        verify(accum).append("Testing");
    }

}