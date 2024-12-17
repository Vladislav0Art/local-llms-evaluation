package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedCommentOuterHtmlHeadReturnsCorrectContent {

    @Test
    public void commentOuterHtmlHeadReturnsCorrectContent() {
        // Stub the DocumentOutputSettings for testing purposes
        Document.OutputSettings expected = new Document.OutputSettings();
        expected.setEncoding("UTF-8");

        Comment comment = new Comment("");
        String result = comment.outerHtmlHead(expected, 1, expected);
        assertEquals("", result);
    }

}