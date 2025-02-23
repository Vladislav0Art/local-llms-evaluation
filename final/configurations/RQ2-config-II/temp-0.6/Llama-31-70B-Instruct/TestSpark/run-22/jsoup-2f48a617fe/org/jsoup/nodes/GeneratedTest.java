package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("\n<!--data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assertEquals("<!--data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}