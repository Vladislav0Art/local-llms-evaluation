package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("new test data");
        assertEquals("new test data", comment.getData());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test data");
        assertEquals("<!--test data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment originalComment = new Comment("test data");
        Comment clonedComment = originalComment.clone();
        assertNotSame(originalComment, clonedComment);
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest_NotXmlDeclaration() {
        Comment comment = new Comment("test data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest_IsXmlDeclaration_Exclamation() {
        Comment comment = new Comment("!html data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest_IsXmlDeclaration_Question() {
        Comment comment = new Comment("?html data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest_NotXmlDeclaration() {
        Comment comment = new Comment("test data");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest_IsXmlDeclaration() {
        Comment comment = new Comment("!DOCTYPE html");
        assertNotNull(comment.asXmlDeclaration());
        assertTrue(comment.asXmlDeclaration().isXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();

        try {
            comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        } catch (IOException e) {
            fail();
        }

        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();

        try {
            comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        } catch (IOException e) {
            fail();
        }

        assertEquals("", accum.toString());
    }

}