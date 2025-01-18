package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("newTest");
        assertEquals("newTest", comment.getData());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(sb, 0, out);
        assertEquals("<!--test-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlTail(sb, 0, out);
        assertEquals("", sb.toString());
    }

}