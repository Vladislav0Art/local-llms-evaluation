package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String data = "test comment";
        Comment comment = new Comment(data);
        StringWriter writer = new StringWriter();

        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());

        Assert.assertEquals("<!--" + data + "-->", writer.toString());
    }

}