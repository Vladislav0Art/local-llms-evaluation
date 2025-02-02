package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void newCommentCreatesNewInstance() {
        Comment comment = new Comment("Hello, World!");
        assertNotNull(comment);
        assertTrue(comment instanceof LeafNode);
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello, World!", comment.getData());
    }

    @Test
    public void newCommentIsXmlDeclarationFalse() {
        Comment comment = new Comment("Hello, World!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void newCommentIsXmlDeclarationTrue() {
        Comment comment = new Comment("!<?xml version='1.0' encoding='UTF-8'?><root><child/></root>");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void newCommentAsXmlDeclarationReturnsNull() {
        Comment comment = new Comment("Hello, World!");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void newCommentAsXmlDeclarationCorrectlyParses() throws IOException {
        Comment comment = new Comment("!<?xml version='1.0' encoding='UTF-8'?><root><child/></root>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("Hello, World!", decl.getDECLARATION());
    }

    @Test
    public void outerHtmlHeadAppendsToStream() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document outputSettings = new Document.OutputSettings(false, true);
        Comment comment = new Comment("Hello, World!");
        comment.outerHtmlHead(accum, 0, outputSettings);
        String expected = "<!--Hello, World!-->";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void outerHtmlTailDoesNotAppendToStream() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document outputSettings = new Document.OutputSettings(false, true);
        Comment comment = new Comment("Hello, World!");
        comment.outerHtmlTail(accum, 0, outputSettings);
        String expected = "";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void outerHtmlHeadIsPrettiedWhenRequired() throws IOException {
        Document outputSettings = new Document.OutputSettings(true, true);
        Comment comment = new Comment("Hello, World!");
        StringBuilder accum = new StringBuilder();
        Appendable appendable = accum;
        Document document = null;
        int depth = 0;
        comment.outerHtmlHead(appendable, depth, outputSettings);
        String expected = "<div><p><!--Hello, World!--></p></div>";
        assertEquals(expected, accum.toString());
    }

    @Test
    public void outerHtmlHeadIsNotPrettiedWhenNotRequired() throws IOException {
        Document outputSettings = new Document.OutputSettings(false, true);
        Comment comment = new Comment("Hello, World!");
        StringBuilder accum = new StringBuilder();
        Appendable appendable = accum;
        Document document = null;
        int depth = 0;
        comment.outerHtmlHead(appendable, depth, outputSettings);
        String expected = "<!--Hello, World!-->";
        assertEquals(expected, accum.toString());
    }

}