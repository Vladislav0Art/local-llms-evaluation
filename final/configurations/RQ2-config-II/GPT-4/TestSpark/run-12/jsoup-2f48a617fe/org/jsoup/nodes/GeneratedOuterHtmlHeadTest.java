package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("testing");
        Writer writer = new StringWriter();

        comment.outerHtmlHead(writer, 0, new Document.OutputSettings().prettyPrint(false));

        assertEquals("<!--testing-->", writer.toString());
    }

}