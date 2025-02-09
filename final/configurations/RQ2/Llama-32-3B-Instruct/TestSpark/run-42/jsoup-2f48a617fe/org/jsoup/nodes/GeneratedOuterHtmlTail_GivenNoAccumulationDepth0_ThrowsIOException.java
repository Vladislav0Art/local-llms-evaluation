package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_GivenNoAccumulationDepth0_ThrowsIOException {

    @Test
    public void outerHtmlTail_GivenNoAccumulationDepth0_ThrowsIOException() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getIndentLevel()).thenReturn(depth);
        Comment comment = new Comment("data");
        assertTrue throws IOException(comment.outerHtmlTail(accum, depth, out));
    }

}