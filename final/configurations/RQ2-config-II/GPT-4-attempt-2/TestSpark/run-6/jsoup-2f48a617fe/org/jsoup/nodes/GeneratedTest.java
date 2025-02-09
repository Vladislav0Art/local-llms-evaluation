package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        Comment commentUpdated = comment.setData("updated comment");
        assertEquals("updated comment", commentUpdated.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("<!--test comment-->", stringBuilder.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test comment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("", stringBuilder.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test comment");
        assertEquals("<!--test comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment commentClone = comment.clone();
        assertNotEquals(comment, commentClone);
        assertEquals(comment.getData(), commentClone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test comment");
        assertNull(comment.asXmlDeclaration());
    }

}