package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void commentConstructorTest() {
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
        comment.setData("Updated test comment");
        assertEquals("Updated test comment", comment.getData());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
        assertNotSame(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationPositiveTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationNegativeTest() {
        Comment comment = new Comment("Not XML comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationPositiveTest() {
        Comment comment = new Comment("!DOCTYPE example");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void asXmlDeclarationNegativeTest() {
        Comment comment = new Comment("Not XML comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("Test comment");
        assertEquals("<!--Test comment-->", comment.outerHtml());
    }

    @Test
    public void outerHtmlTailTest() throws Exception {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("<!--Test comment-->", comment.toString());
    }

}