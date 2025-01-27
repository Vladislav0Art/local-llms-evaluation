package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlHeadCommentNotCalledWhenDepthIs0 {

    @Test
    public void outerHtmlHeadCommentNotCalledWhenDepthIs0() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum, times(0)).append(any());
    }

}