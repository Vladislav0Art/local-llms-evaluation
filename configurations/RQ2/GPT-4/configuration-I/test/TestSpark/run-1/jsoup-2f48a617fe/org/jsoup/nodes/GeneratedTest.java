package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorAndGetDataTest() {
        String data = "Test data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataTest() {
        String data = "Test data";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void cloneTest() {
        String data = "Test data";
        Comment comment = new Comment(data);
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
        assertNotSame(comment, cloneComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder out = new StringBuilder();
        Comment comment = new Comment("Test data");
        comment.outerHtmlHead(out, 0, new Document("").outputSettings());
        String expected = "<!-- Test data -->";
        assertEquals(expected, out.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        StringBuilder out = new StringBuilder();
        Comment comment = new Comment("Test data");
        comment.outerHtmlTail(out, 0, new Document("").outputSettings());
        String expected = ""; // Expected as it is LeafNode, it does not have a tail.
        assertEquals(expected, out.toString());
    }

    @Test
    public void toStringTest() {
        String data = "Test data";
        Comment comment = new Comment(data);
        String expected = "<!--" + data + "-->";
        assertEquals(expected, comment.toString());
    }

}