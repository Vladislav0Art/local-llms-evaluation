package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentIsXmlDeclarationTest {

    @Mock
    Comment comment;

    @Test
    public void CommentIsXmlDeclarationTest() throws Exception {
        when(comment.isXmlDeclaration()).thenReturn(true);
        assertEquals(true, comment.isXmlDeclaration());
    }

}