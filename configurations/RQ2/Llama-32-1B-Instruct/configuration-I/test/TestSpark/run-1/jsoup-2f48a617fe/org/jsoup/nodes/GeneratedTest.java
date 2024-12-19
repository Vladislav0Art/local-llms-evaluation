package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    private String data;

    @Test
    public void nodeName() {
        assertTrue(comment.nodeName());
    }

    @Test
    public void getData() {
        assertEquals("Comment", comment.getData());
    }

    @Test
    public void setData() {
        comment.setData("New comment data");
        assertFalse(comment.isXmlDeclaration());
        assertTrue(comment.asXmlDeclaration().isXmlDeclaration());
    }

    @Test
    public void toString() {
        String expected = "<comment data=\"New comment data\"></comment>";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void clone() {
        Comment otherComment = new Comment("Other comment data");
        assertTrue(comment.clone().getData().equals(otherComment.getData()));
        assertFalse(comment.clone().isXmlDeclaration());
        assertTrue(comment.clone().asXmlDeclaration().isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration() {
        Comment comment2 = new Comment("Comment data");
        String expected = "<comment xml=\"\" data=\"New comment data\"></comment>";
        assertEquals(expected, comment2.asXmlDeclaration().toString());
    }

}