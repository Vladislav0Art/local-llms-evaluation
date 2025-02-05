package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.Writer;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test");
        Writer writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());
        Assert.assertEquals("<!--Test-->", writer.toString());
    }

}