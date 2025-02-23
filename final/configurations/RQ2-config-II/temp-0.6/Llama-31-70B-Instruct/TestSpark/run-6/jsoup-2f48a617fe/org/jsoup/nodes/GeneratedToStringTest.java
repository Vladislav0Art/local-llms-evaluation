package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void toStringTest() {
        Mockito.when(comment.toString()).thenReturn("toString");
        assertEquals("toString", comment.toString());
    }

}