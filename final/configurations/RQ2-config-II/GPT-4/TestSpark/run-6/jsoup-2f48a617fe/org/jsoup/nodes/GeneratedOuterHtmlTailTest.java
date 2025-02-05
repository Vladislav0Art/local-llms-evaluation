package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test data");
        StringWriter writer = new StringWriter();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(writer, 0, outputSettings);
        Assert.assertEquals("", writer.toString());
    }

}