package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("Test string");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!--Test string-->", sb.toString());
    }

}