package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringWriter output = new StringWriter();
        comment.outerHtmlTail(output, 0, new Document("").outputSettings());
        Assert.assertEquals("", output.toString());
    }

}