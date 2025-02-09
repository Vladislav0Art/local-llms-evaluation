package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("TestHead");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("TestHead"));
    }

}