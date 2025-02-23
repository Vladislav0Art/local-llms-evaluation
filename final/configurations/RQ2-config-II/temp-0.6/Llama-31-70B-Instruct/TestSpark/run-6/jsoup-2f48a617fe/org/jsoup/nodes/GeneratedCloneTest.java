package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void cloneTest() {
        Mockito.when(comment.clone()).thenReturn(comment);
        assertEquals(comment, comment.clone());
    }

}