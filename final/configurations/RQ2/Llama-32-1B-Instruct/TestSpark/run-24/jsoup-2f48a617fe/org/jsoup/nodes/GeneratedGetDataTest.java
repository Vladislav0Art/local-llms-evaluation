package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        when(mockComment.getData()).thenReturn("test data");

        assertEquals("test data", new Comment(null).getData());
    }

}