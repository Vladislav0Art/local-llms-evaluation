package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentCloneTest {

    @Mock
    Comment comment;

    @Test
    public void CommentCloneTest() throws Exception {
        when(comment.clone()).thenReturn(comment);
        Comment clone = comment.clone();
        assertEquals(clone, comment);
    }

}