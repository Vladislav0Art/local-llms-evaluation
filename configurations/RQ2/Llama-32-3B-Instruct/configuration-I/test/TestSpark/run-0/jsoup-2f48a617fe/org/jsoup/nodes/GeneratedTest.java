package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructor_test() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("data");
        assertEquals("", comment.nodeName());
    }

    @Test
    public void getData_test() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void toString_test() {
        Comment comment = new Comment("data");
        assertNotNull(comment.toString());
    }

    @Test
    public void clone_test() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_test() {
        Comment comment = new Comment("");
        assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("data");
        assertTrue(comment.nodeName().isEmpty());
    }

    @Test
    public void toString_test() {
        Comment comment = new Comment("");
        assertNotNull(comment.toString());
    }

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void getData_test() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void outerHtmlHead_test() {
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        try {
            comment.outerHtmlHead(accum, depth, out);
        } catch (IOException e) {
            fail(e.toString());
        }
    }

    @Test
    public void outerHtmlTail_test() {
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
    }

    @Test
    public void outerHtmlHead_test() {
        Comment comment = new Comment("");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        try {
            comment.outerHtmlHead(accum, depth, out);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void outerHtmlTail_test() {
        Comment comment = new Comment("");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
    }

    @Test
    public void toString_test() {
        Comment comment = new Comment("");
        String strComment = comment.toString();
        assertNotNull(strComment);
    }

}