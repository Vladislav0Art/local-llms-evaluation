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
        String expectedHtml = "<!--commentData-->";
        StringWriter writer = new StringWriter();
        Comment comment = new Comment("commentData");
        Document.OutputSettings settings = new Document.OutputSettings();
        comment.outerHtmlHead(writer, 0, settings);

        Assert.assertEquals(expectedHtml, writer.toString());
    }

}