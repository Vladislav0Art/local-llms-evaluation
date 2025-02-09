package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings().prettyPrint(false));
        assertEquals("", accum.toString());
    }

}