package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedGetDataTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void getDataTest() {
        Mockito.when(comment.getData()).thenReturn("data");
        assertEquals("data", comment.getData());
    }

}