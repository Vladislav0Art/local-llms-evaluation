package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("Comment data");
        assertEquals("Comment data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.setData("Comment data")).thenReturn(comment);
        assertEquals("Comment data", comment.setData("Comment data").getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("<?xml version='1.0' encoding='UTF-8'?>");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.asXmlDeclaration()).thenReturn(null);
        assertNull(comment.asXmlDeclaration());
    }

}