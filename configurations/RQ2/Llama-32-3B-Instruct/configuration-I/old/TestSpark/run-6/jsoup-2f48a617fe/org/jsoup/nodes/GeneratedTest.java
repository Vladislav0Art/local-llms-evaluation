package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedTest {

    @Test
    public void constructor_CreatesComment() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
    }

    @Test
    public void nodeName_ReturnsNodeName() {
        Comment comment = new Comment("Hello World!");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_ReturnsData() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void setData_SetsData() {
        Comment comment = new Comment("Hello World!");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHead_PassesDepthAndSettings() throws IOException {
        Document document = new org.jsoup.nodes.Document();
        Appendable accum = new java.util.StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new org.jsoup.Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains("<!--"));
    }

    @Test
    public void outerHtmlTail_PassesDepthAndSettings() {
        Document document = new org.jsoup.nodes.Document();
        Appendable accum = new java.util.StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new org.jsoup.Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(accum.toString().contains("-->"));
    }

    @Test
    public void toString_ReturnsStringRepresentation() {
        Comment comment = new Comment("Hello World!");
        assertEquals("<!-- comment -->", comment.toString());
    }

    @Test
    public void clone_CreatesNewComment() {
        Comment comment = new Comment("Hello World!");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsNull() {
        Comment comment = new Comment("Hello World!");
        assertNull(comment.asXmlDeclaration());
    }

}