package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedOuterHtmlHeadIncludesCommentTest {

    @Test
    public void outerHtmlHeadIncludesCommentTest() {
        StringBuilder sb = new StringBuilder();
        Appendable accum = sb;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(sb.toString().contains("<!-- data -->"));
    }

}