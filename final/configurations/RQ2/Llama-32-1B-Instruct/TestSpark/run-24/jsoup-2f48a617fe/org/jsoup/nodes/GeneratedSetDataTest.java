package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "test data";
        when(mockComment.setData(data)).thenReturn(data);

        assertEquals(data, new Comment(data).setData(data));
    }

}