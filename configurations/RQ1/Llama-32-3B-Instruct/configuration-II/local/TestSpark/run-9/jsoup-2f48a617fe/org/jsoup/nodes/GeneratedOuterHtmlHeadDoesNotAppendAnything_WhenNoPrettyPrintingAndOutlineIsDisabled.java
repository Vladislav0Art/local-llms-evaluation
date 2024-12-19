package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadDoesNotAppendAnything_WhenNoPrettyPrintingAndOutlineIsDisabled {

    @Test
    public void outerHtmlHeadDoesNotAppendAnything_WhenNoPrettyPrintingAndOutlineIsDisabled() throws IOException {
        Comment comment = new Comment("Some data");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        Document doc = mock(document.class);
        when(out.prettyPrint()).thenReturn(false);
        when(out.outline()).thenReturn(false);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}