package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test");
        assertNotNull(comment);
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
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings().prettyPrint(false));
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings().prettyPrint(false));
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertEquals(comment.getData(), clone.getData());
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

}