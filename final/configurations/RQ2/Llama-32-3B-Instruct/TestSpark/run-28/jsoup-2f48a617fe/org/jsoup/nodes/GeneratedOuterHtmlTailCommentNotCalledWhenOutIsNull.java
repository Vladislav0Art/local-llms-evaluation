package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlTailCommentNotCalledWhenOutIsNull {

    @Test
    public void outerHtmlTailCommentNotCalledWhenOutIsNull() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = null;
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum, times(0)).append(any());
    }

}