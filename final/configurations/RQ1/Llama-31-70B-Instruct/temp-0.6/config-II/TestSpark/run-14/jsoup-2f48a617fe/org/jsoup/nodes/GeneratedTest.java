package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData("This is a new comment");
        assertEquals("This is a new comment", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("This is a comment");
        assertFalse(comment.isXmlDeclaration());

        comment = new Comment("! This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("? This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("This is a comment");
        assertNull(comment.asXmlDeclaration());

        comment = new Comment("! This is an XML Declaration");
        assertNotNull(comment.asXmlDeclaration());
    }

}