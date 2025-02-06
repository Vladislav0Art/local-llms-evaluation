package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedOuterHtmlTailDoesNotIncludeCommentTest {

    @Test
    public void outerHtmlTailDoesNotIncludeCommentTest() {
        StringBuilder sb = new StringBuilder();
        Appendable accum = sb;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        assertFalse(sb.toString().contains("<!-- data -->"));
    }

}