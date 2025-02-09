package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlTail_comment_setsAccumulation {

    @Test
    public void outerHtmlTail_comment_setsAccumulation() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(anyString());
    }

}