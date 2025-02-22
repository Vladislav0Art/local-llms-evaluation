package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test comment");
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test comment");
        assertNotNull(comment.outerHtmlHead(new StringBuilder(), 0, null));
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");
        assertNotNull(comment.asXmlDeclaration());
    }

}