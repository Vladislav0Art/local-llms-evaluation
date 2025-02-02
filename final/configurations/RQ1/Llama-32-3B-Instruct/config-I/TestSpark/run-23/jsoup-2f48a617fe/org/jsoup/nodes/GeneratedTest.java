package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void newCommentCreation() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameGet() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void dataGet() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment.getData());
    }

    @Test
    public void setData() {
        String data = "New comment";
        Comment comment = new Comment("This is a comment");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHead() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--This is a comment-->", outContent.toString().trim());
    }

    @Test
    public void outerHtmlTail() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", outContent.toString().trim());
    }

    @Test
    public void clone() {
        String data = "This is a comment";
        Comment originalComment = new Comment(data);
        Comment clonedComment = originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationGet() {
        Comment comment = new Comment("This is a comment");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationNoMatch() {
        Comment comment = new Comment("Not an XML declaration");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationGetNull() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("This is a comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

    @Test
    public void asXmlDeclarationGetMatch() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("<<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE root SYSTEM \"root.dtd\"?>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals(comment.getData(), decl.getDecl());
    }

    @Test
    public void asXmlDeclarationGetAttributes() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("<<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE root SYSTEM \"root.dtd\"?>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals(comment.getData(), decl.getDecl());
        assertEquals("UTF-8", decl.getAttribute("version"));
    }

}