package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringWriter writer = new StringWriter();
        Document.OutputSettings settings = new Document.OutputSettings();

        comment.outerHtmlHead(writer, 1, settings);
        assertTrue(writer.toString().contains("Test comment"));
    }

}