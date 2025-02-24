package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test Data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test Data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("<!--Test Data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test Data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test Data");
        assertEquals("Comment[comment, data=Test Data]", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Data");
        Comment commentClone = comment.clone();
        assertNotNull(commentClone);
        assertEquals(comment, commentClone);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test Data");
        assertFalse(comment.isXmlDeclaration());
    }

}