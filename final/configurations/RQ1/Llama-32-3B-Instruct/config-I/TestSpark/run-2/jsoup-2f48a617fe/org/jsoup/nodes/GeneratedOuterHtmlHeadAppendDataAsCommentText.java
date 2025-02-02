package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadAppendDataAsCommentText {

    @Test
    public void outerHtmlHeadAppendDataAsCommentText() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 0, out);
            assertTrue(accum.toString().contains(comment.getData()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}