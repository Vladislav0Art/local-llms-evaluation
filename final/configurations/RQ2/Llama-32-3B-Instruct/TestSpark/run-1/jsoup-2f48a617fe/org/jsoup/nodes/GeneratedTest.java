package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

    @Test
    public void newCommentConstructors_ReturnsNewComment() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

    @Test
    public void nodeName_returnsCorrectName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_returnsDataOfComment() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void setData_setsCorrectDataForComment() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void clone_returnsNewCommentClone() {
        Comment comment1 = new Comment("data");
        Comment comment2 = comment1.clone();
        assertNotNull(comment2);
        assertEquals(comment1, comment2);
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsNullWhenNotDeclaration() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHead_throwsExceptionWhenAccumulatorIsFull() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        try {
            comment.outerHtmlHead(bos, 0, out);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void outerHtmlTail_setsCorrectTailForComment() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        String expectedOutput = "<!-- comment -->\n";
        assertTrue(comment.outerHtmlTail(bos, 0, out).equals(expectedOutput));
    }

    @Test
    public void outerHtmlHead_setsCorrectDataForComment() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        String expectedOutput = "<!-- data -->\n";
        assertTrue(comment.outerHtmlHead(bos, 0, out).equals(expectedOutput));
    }
}

public class Comment {

    public static String outerHtmlHead(String value) {
        return "<!-- " + value + " -->\n";
    }

    public static boolean isXmlDeclaration() {
        return false;
    }

    public static String asXmlDeclaration() {
        return "";
    }

    public static void outerHtmlTail(ByteArrayOutputStream bos, int index, Document.OutputSettings out) {

    }

    public static String outerHtmlHead(ByteArrayOutputStream bos, int index, Document.OutputSettings out) {
        // implementation
    }

}