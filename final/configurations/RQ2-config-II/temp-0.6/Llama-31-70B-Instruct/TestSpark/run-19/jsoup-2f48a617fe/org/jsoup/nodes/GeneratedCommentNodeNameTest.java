package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentNodeNameTest {

    @Mock
    Comment comment;

    @Test
    public void CommentNodeNameTest() throws Exception {
        String nodeName = "comment";
        when(comment.nodeName()).thenReturn(nodeName);
        assertEquals(nodeName, comment.nodeName());
    }

}