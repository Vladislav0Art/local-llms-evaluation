package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.jupiter.api.Test;

public class GeneratedTestOuterHtmlTail {

    private Document document = new Document();
    private ParseSettings parseSettings = new ParseSettings();

    public void testCreateComment() {
        comment = new Comment("This is a sample comment");
    }

    public void testGetData() {
        assertEquals("This is a sample comment", comment.getData());
    }

    public void testSetData() {
        comment.setData("New content here");
        assertEquals("New content here", comment.getData());
    }

    @Test
    public void testOuterHtmlTail() {
        Comment comment2 = new Comment(getData());
        doc.tail.append(comment2.outerHtmlTail(new Appendable(), 1, new Document.OutputSettings()));
        assertTrue(doc.html().contains("<!--New content here-->"));
    }

}