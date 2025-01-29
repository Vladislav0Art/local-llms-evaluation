package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "This is a test comment";
        when(mockComment.clone()).thenReturn(new Comment(data));

        assertEquals(new Comment(data), new Comment(null).clone());
    }

}