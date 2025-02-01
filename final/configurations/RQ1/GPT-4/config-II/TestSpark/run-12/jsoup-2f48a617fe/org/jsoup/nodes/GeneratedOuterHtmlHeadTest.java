package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test comment");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);
        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, settings);
        Assert.assertEquals("<!--test comment-->", writer.toString());
    }

}