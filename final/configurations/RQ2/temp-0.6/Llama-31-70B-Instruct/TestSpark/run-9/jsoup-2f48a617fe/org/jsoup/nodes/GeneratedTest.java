package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("data");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("<!--data-->", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assertEquals("Comment[data]", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertEquals("data", clonedComment.getData());
        assertNotEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}