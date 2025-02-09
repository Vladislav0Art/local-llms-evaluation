package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("");
        StringWriter writer = new StringWriter();

        comment.outerHtmlTail(writer, 0, new Document.OutputSettings());

        Assert.assertEquals("", writer.toString());
    }

}