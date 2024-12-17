package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNewComment() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void testDataSetter() {
        Comment comment = new Comment("Hello World!");
        Comment newComment = comment.setData("New Data");
        assertNotNull(newComment);
        assertEquals("New Data", newComment.getData());
        assertEquals("#comment", newComment.nodeName());
    }

    @Test
    public void testClone() {
        Comment comment = new Comment("Hello World!");
        Comment cloneComment = comment.clone();
        assertNotNull(cloneComment);
        assertEquals("#comment", cloneComment.nodeName());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!XML Declaration");
        assertTrue(comment.isXmlDeclaration());
        Comment comment2 = new Comment("?XML Declaration");
        assertTrue(comment2.isXmlDeclaration());
    }

    @Test
    public void testIsNotXmlDeclaration() {
        Comment comment = new Comment("Hello World!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationNoMatch() {
        Comment comment = new Comment("#comment");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationNoMatchWithBogusComment() {
        Comment comment = new Comment("Hello World!");
        assertNull(comment.asXmlDeclaration());
    }

}