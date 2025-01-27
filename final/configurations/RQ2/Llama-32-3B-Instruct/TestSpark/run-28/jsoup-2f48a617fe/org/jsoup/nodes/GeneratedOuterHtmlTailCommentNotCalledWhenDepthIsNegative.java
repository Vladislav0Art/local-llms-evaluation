package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlTailCommentNotCalledWhenDepthIsNegative {

    @Test
    public void outerHtmlTailCommentNotCalledWhenDepthIsNegative() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = -1;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum, times(0)).append(any());
    }

}