package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("comment");
        assertEquals("comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!--comment-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("comment");
        assertEquals("comment", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("comment");
        Comment commentClone = comment.clone();
        assertEquals(comment.getData(), commentClone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("comment");
        assertFalse(comment.isXmlDeclaration());
    }

}