package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();

        comment.outerHtmlTail(accum, 0, out);

        assertEquals("", accum.toString()); // Comment has no tail
    }

}