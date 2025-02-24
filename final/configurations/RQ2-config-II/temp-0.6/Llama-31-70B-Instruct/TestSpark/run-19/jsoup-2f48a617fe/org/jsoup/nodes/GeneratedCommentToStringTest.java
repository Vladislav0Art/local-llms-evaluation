package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentToStringTest {

    @Mock
    Comment comment;

    @Test
    public void CommentToStringTest() throws Exception {
        String toString = "some string";
        when(comment.toString()).thenReturn(toString);
        assertEquals(toString, comment.toString());
    }

}