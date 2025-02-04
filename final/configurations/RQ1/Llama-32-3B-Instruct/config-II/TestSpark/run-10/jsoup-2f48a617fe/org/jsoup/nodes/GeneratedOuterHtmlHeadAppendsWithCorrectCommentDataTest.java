package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadAppendsWithCorrectCommentDataTest {

    @Test
    public void outerHtmlHeadAppendsWithCorrectCommentDataTest() throws IOException {
        Comment comment = new Comment("This is a test");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlHead(accum, 0, out);
        String output = outContent.toString();
        assertTrue(output.contains("<!--"));
        assertTrue(output.endsWith("-->"));
    }

}