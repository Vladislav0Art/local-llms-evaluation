package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "This is a test comment";
        when(mockComment.nodeName()).thenReturn(data);

        assertEquals("This is a test comment", new Comment(data).nodeName());
    }

}