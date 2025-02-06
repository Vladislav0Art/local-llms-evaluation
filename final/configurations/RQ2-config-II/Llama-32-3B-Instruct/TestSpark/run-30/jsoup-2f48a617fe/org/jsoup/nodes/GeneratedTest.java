package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorCommentTest() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("data", comment.getData());
    }

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("", comment.nodeName());
    }

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadCommentTest_ThrowsIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
    }

    @Test
    public void outerHtmlTailCommentTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", outContent.toString());
    }

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("data");
        String expectedOutput = "<!-- data -->";
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationCommentTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNullCommentTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}