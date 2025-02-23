package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("hello");
        assertEquals("hello", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("hello");
        assertEquals("hello", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("hello");
        assertTrue(!comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!hello");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("hello", xmlDeclaration.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("hello");
        String expected = "<!--hello-->";
        StringBuilder actual = new StringBuilder();
        comment.outerHtmlHead(actual, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals(expected, actual.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("hello");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("", builder.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("hello");
        assertEquals("<!---->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("hello");
        Comment clone = (Comment) comment.clone();
        assertEquals("hello", clone.getData());
    }

}