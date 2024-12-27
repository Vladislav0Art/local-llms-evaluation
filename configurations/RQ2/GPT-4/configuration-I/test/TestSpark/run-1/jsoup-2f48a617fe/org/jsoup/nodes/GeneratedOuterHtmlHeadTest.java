package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder out = new StringBuilder();
        Comment comment = new Comment("Test data");
        comment.outerHtmlHead(out, 0, new Document("").outputSettings());
        String expected = "<!-- Test data -->";
        assertEquals(expected, out.toString());
    }

}