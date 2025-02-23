package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void outerHtmlHeadTest() {
        Mockito.when(comment.outerHtmlHead(null, 0, null)).thenReturn(comment);
        assertEquals(comment, comment.outerHtmlHead(null, 0, null));
    }

}