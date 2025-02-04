package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailIsNotUsed {

    @Test
    public void outerHtmlTailIsNotUsed() {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(accum, depth, out);
        verifyNoMoreInteractions(accum);
    }

}