package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedTest {

    @Test
    public void nodeName_isCommentTest() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void setData_setsDataCorrectlyTest() {
        Comment comment = new Comment("");
        comment.setData("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void outerHtmlHead_appendsCorrectNodeTest() throws java.io.IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Comment comment = new Comment("");
        comment.outerHtmlHead(new StringBuilder(), 0, null);
        assertEquals("<!-- test -->\n", outContent.toString());
        System.setOut(originalOut);
    }

    @Test
    public void outerHtmlTail_appendsCorrectNodeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Comment comment = new Comment("");
        try {
            comment.outerHtmlHead(null, 0, null);
        } catch (java.io.IOException e) {
        }
        assertEquals("<!-- test -->\n", outContent.toString());
        System.setOut(originalOut);
    }

    @Test
    public void clone_returnsCorrectCommentTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertTrue(comment.equals(clonedComment));
    }

    @Test
    public void isXmlDeclaration_returnsFalseTest() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsNullTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}