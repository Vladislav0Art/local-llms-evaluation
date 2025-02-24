package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentSetDataTest {

    @Mock
    Comment comment;

    @Test
    public void CommentSetDataTest() throws Exception {
        String data = "some data";
        when(comment.setData(data)).thenReturn(comment);
        Comment setData = comment.setData(data);
        assertEquals(setData, comment);
    }

}