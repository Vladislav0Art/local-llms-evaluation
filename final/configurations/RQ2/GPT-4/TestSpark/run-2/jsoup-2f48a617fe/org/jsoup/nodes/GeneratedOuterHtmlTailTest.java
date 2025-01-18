package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test comment");
        StringWriter writer = new StringWriter();
        Document.OutputSettings settings = new Document.OutputSettings();

        comment.outerHtmlTail(writer, 1, settings);
        // Expecting empty string because method is empty in original class.
        assertEquals("", writer.toString());
    }

}