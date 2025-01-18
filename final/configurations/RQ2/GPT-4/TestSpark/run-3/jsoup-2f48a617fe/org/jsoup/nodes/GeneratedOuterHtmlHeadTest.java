package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuffer testBuffer = new StringBuffer();
        Comment comment = new Comment("test");
        comment.outerHtmlHead(testBuffer, 0, new Document.OutputSettings());
        Assert.assertTrue(testBuffer.length() > 0);
    }

}