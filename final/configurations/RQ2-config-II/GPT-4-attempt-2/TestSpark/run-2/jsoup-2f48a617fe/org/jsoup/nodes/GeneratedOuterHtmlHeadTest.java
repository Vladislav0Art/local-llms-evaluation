package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        comment.outerHtmlHead(accum, 0, out);

        assertEquals("<!--Data-->", accum.toString());
    }

}