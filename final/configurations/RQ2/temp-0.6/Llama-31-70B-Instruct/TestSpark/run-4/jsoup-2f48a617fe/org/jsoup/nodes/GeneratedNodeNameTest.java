package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.nodeName()).thenReturn("test");
        assertEquals("test", comment.nodeName());
    }

}