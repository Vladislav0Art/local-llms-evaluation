package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @After
    public void tearDown() {
        comment = null;
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("new comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() {
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, mock(ParseSettings.class));
        assertEquals("<!--comment-->", builder.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, mock(ParseSettings.class));
        assertEquals("", builder.toString());
    }

    @Test
    public void toStringTest() {
        assertEquals("<!--comment-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment newComment = comment.clone();
        assertNotNull(newComment);
        assertEquals(comment, newComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        String data = "comment";
        when(comment.getData()).thenReturn(data);
        assertEquals(null, comment.asXmlDeclaration());
    }

}