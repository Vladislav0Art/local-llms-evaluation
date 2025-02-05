package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.Writer;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Testing");
        Writer writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, new Document.OutputSettings());
        Assert.assertEquals("", writer.toString());
    }

}