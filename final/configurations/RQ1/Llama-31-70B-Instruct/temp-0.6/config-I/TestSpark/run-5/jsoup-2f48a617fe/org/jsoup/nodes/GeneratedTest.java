package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Comment");
        String data = comment.getData();
        assertEquals("Test Comment", data);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Comment");
        comment.setData("New Comment");
        assertEquals("New Comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test Comment");
        Appendable accumulator = mock(Appendable.class);
        comment.outerHtmlHead(accumulator, 1, new Document.OutputSettings());
        verify(accumulator).append("<!--Test Comment-->");
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test Comment");
        Appendable accumulator = mock(Appendable.class);
        comment.outerHtmlTail(accumulator, 1, new Document.OutputSettings());
        verify(accumulator, never()).append(anyString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("<!--Test Comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Comment");
        Comment clone = comment.clone();
        assertEquals("Test Comment", clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertFalse(comment.isXmlDeclaration());
        comment = new Comment("!Test Comment");
        assertTrue(comment.isXmlDeclaration());
    }

}