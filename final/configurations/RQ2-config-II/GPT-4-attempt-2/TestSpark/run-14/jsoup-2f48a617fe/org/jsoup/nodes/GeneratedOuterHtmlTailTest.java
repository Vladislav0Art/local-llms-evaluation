package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("TestTail");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}