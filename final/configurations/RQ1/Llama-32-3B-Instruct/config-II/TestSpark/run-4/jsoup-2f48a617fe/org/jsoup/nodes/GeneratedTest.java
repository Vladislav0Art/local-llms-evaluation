package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void createCommentDataTest() {
        String data = "comment text";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void commentSetDataAndGetDataTest() {
        String data = "new comment text";
        Comment comment = new Comment("old comment text");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadCommentTest() throws IOException {
        Document doc = new Document();
        Appendable accum = new ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<html>Comment text</html>");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--<html>Comment text</html-->-->", accum.toString());
    }

    @Test
    public void outerHtmlTailCommentTest() throws IOException {
        Document doc = new Document();
        Appendable accum = new ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<html>Comment text</html>");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlCommentToStringTest() throws IOException {
        Document doc = new Document();
        Appendable accum = new ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<html>Comment text</html>");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--<html>Comment text</html-->-->", comment.toString());
    }

    @Test
    public void cloneCommentTest() {
        String data = "comment text";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(data, clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationEmptyStringTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationStartsWithQuestionMarkTest() {
        Comment comment = new Comment("?xml version=\"1.0\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationStartsWithExclamationMarkTest() {
        Comment comment = new Comment("!xml version=\"1.0\" ?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationEmptyStringTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationStartsWithQuestionMarkTest() {
        Comment comment = new Comment("?xml version=\"1.0\" ?");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertTrue(xmlDecl.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationStartsWithExclamationMarkTest() {
        Comment comment = new Comment("!xml version=\"1.0\" ?");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertTrue(xmlDecl.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationParseWithSuccessTest() throws Exception {
        String data = "<!xml version=\"1.0\" ?><tag>content</tag>";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("tag", xmlDecl.tagName());
    }

    @Test
    public void asXmlDeclarationParseWithNoContentTest() throws Exception {
        String data = "<!xml version=\"1.0\" ?><";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNull(xmlDecl);
    }

}