package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        comment.outerHtmlHead(accum, depth, out);
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}