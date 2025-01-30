package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeFilter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Hello, World!");

        StringWriter stringWriter = new StringWriter();
        comment.outerHtmlHead(stringWriter, 0, new Document.OutputSettings().prettyPrint(true));

        Assert.assertEquals("<!--Hello, World!-->", stringWriter.toString());
    }

}