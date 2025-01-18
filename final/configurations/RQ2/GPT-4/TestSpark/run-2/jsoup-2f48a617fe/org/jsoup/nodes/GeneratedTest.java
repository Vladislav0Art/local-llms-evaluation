package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test comment");
        comment.setData("Test comment 2");
        assertEquals("Test comment 2", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringWriter writer = new StringWriter();
        Document.OutputSettings settings = new Document.OutputSettings();

        comment.outerHtmlHead(writer, 1, settings);
        assertTrue(writer.toString().contains("Test comment"));
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test comment");
        StringWriter writer = new StringWriter();
        Document.OutputSettings settings = new Document.OutputSettings();

        comment.outerHtmlTail(writer, 1, settings);
        // Expecting empty string because method is empty in original class.
        assertEquals("", writer.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test comment");
        assertTrue(comment.toString().contains("Test comment"));
    }

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("Test comment");
        Comment comment2 = comment1.clone();
        assertEquals(comment1.getData(), comment2.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");
        assertNull(comment.asXmlDeclaration());
    }

}