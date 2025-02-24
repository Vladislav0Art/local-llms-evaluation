package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.setData("test")).thenReturn(comment);
        assertEquals(comment, comment.setData("test"));
    }

}