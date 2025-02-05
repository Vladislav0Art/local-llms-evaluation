package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder stringBuilder = new StringBuilder();

        comment.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals("", stringBuilder.toString());
    }

}