package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.nodeName()).thenReturn("test");
        assertEquals("test", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.setData("test")).thenReturn(comment);
        assertEquals(comment, comment.setData("test"));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doNothing().when(comment).outerHtmlHead(Mockito.any(), Mockito.anyInt(), Mockito.any());
        comment.outerHtmlHead(Mockito.any(), Mockito.anyInt(), Mockito.any());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doNothing().when(comment).outerHtmlTail(Mockito.any(), Mockito.anyInt(), Mockito.any());
        comment.outerHtmlTail(Mockito.any(), Mockito.anyInt(), Mockito.any());
    }

    @Test
    public void toStringTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.toString()).thenReturn("test");
        assertEquals("test", comment.toString());
    }

}