package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("test comment");
        assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new test comment");
        assertEquals("new test comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlHead(builder, 0, outputSettings);
        assertEquals("<!--test comment-->", builder.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test comment");
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(builder, 0, outputSettings);
        assertEquals("", builder.toString());
    }

    @Test
    public void commentToStringTest() {
        Comment comment = new Comment("test comment");
        assertEquals("<!--test comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test comment");
        assertNull(comment.asXmlDeclaration());
    }

}