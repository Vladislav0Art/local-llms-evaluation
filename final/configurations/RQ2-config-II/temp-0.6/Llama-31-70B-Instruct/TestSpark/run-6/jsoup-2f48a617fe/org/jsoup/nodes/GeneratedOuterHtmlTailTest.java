package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void outerHtmlTailTest() {
        Mockito.when(comment.outerHtmlTail(null, 0, null)).thenReturn(comment);
        assertEquals(comment, comment.outerHtmlTail(null, 0, null));
    }

}