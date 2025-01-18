package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("Test data");
        assertNotNull(comment);
    }

    @Test
    public void getNodeNameTest() {
        Comment comment = new Comment("Test data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test data");
        assertEquals("Test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test data");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlHead(sb, 0, outputSettings);
        assertEquals("<!--Test data-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test data");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(sb, 0, outputSettings);
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test data");
        assertEquals("<!--Test data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertNotSame(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        assertNull(comment.asXmlDeclaration());
    }

}