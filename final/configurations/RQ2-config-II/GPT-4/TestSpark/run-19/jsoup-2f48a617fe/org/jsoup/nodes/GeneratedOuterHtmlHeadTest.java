package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder stringBuilder = new StringBuilder();

        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals("<!--Test comment-->", stringBuilder.toString());
    }

}