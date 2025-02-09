package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("", stringBuilder.toString());
    }

}