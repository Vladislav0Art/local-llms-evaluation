package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.toString()).thenReturn("test");
        assertEquals("test", comment.toString());
    }

}