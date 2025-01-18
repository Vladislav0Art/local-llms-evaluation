package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        StringBuffer testBuffer = new StringBuffer();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(testBuffer, 0, new Document.OutputSettings());
        Assert.assertTrue(testBuffer.length() > 0);
    }

}