package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void setDataTest() {
        Mockito.when(comment.setData("data")).thenReturn(comment);
        assertEquals(comment, comment.setData("data"));
    }

}