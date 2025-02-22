package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("This is a comment");
        Comment newComment = comment.setData("This is new comment");
        assertEquals("This is new comment", newComment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("This is a comment");
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("This is a comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals(null, decl);
    }

}