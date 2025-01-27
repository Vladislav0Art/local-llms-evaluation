package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlHeadCommentNotCalledWhenOutIsNull {

    @Test
    public void outerHtmlHeadCommentNotCalledWhenOutIsNull() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = null;
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum, times(0)).append(any());
    }

}