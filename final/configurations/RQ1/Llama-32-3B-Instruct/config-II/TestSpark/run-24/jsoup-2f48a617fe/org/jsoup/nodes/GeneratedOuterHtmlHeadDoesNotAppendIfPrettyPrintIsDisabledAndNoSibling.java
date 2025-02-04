package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadDoesNotAppendIfPrettyPrintIsDisabledAndNoSibling {

    @Test
    public void outerHtmlHeadDoesNotAppendIfPrettyPrintIsDisabledAndNoSibling() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(false);
        when(comment.siblingIndex()).thenReturn(1);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

}