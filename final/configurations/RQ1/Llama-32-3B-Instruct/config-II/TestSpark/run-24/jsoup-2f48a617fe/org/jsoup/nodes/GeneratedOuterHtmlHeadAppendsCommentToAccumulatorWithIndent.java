package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadAppendsCommentToAccumulatorWithIndent {

    @Test
    public void outerHtmlHeadAppendsCommentToAccumulatorWithIndent() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--Test-->", accum.toString());
    }

}