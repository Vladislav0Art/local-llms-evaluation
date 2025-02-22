package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello World");
        comment.setData("Goodbye World");
        assertEquals("Goodbye World", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Hello World");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("<!--Hello World-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Hello World");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Hello World");
        Comment cloned = comment.clone();
        assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Hello World");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Hello World");
        assertTrue(comment.asXmlDeclaration() instanceof XmlDeclaration);
    }

}