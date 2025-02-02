package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadDoesNotAddCommentTagWhenPrettyPrintedButNoBlockFormatting {

    @Test
    public void outerHtmlHeadDoesNotAddCommentTagWhenPrettyPrintedButNoBlockFormatting() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings(true, false);
        Comment comment = new Comment("Some text");
        comment.outerHtmlHead(accum, 0, outputSettings);
        assertEquals("", outContent.toString());
    }

}