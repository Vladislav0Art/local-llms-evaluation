package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorNormalTextTest() {
        String testString = "Test string";
        Comment comment = new Comment(testString);
        assertEquals(testString, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test string");
        assertEquals("Test string", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Old string");
        comment.setData("New String");
        assertEquals("New String", comment.getData());
    }

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationWrongTest() {
        Comment comment = new Comment("Just a comment");
        comment.isXmlDeclaration();
    }

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationWrongTest() {
        Comment comment = new Comment("Just a comment");
        comment.asXmlDeclaration();
    }

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("Test string");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!--Test string-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws Exception {
        Comment comment = new Comment("Test string");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test string");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
        assertNotSame(comment, clone);
    }

}