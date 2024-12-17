package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedOuterHtmlTailCommentTest {

    @Test
    public void outerHtmlTailCommentTest() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
        // No assertion needed as this method doesn't return anything
    }

}