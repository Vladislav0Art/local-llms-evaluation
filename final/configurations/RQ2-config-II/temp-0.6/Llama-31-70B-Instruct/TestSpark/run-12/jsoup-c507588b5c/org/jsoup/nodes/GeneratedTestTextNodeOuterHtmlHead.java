package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestTextNodeOuterHtmlHead {

    @Test
    public void testTextNodeOuterHtmlHead() throws IOException {
        TextNode node = new TextNode("Test");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);
        node.outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append("Test");
    }

}