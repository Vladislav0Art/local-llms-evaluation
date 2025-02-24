package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Comment comment;

    @Test
    public void CommentCloneTest() throws Exception {
        when(comment.clone()).thenReturn(comment);
        Comment clone = comment.clone();
        assertEquals(clone, comment);
    }

    @Test
    public void CommentDataTest() throws Exception {
        String data = "some data";
        when(comment.getData()).thenReturn(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void CommentNodeNameTest() throws Exception {
        String nodeName = "comment";
        when(comment.nodeName()).thenReturn(nodeName);
        assertEquals(nodeName, comment.nodeName());
    }

    @Test
    public void CommentSetDataTest() throws Exception {
        String data = "some data";
        when(comment.setData(data)).thenReturn(comment);
        Comment setData = comment.setData(data);
        assertEquals(setData, comment);
    }

    @Test
    public void CommentToStringTest() throws Exception {
        String toString = "some string";
        when(comment.toString()).thenReturn(toString);
        assertEquals(toString, comment.toString());
    }

    @Test
    public void CommentIsXmlDeclarationTest() throws Exception {
        when(comment.isXmlDeclaration()).thenReturn(true);
        assertEquals(true, comment.isXmlDeclaration());
    }

}