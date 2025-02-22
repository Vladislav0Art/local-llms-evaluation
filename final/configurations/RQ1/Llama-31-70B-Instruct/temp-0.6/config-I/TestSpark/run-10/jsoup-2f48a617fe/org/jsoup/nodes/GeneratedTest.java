package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assertEquals("<!---->data<!---->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment commentClone = comment.clone();
        assertNotEquals(comment, commentClone);
        assertEquals(comment.getData(), commentClone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertTrue(!comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.asXmlDeclaration() == null);
    }

}