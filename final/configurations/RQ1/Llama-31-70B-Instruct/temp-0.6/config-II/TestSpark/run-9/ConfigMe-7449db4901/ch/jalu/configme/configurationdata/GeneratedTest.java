package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = mock(CommentsConfiguration.class);
        when(commentsConfiguration.setComment(anyString(), anyString())).thenReturn(commentsConfiguration);
        verify(commentsConfiguration).setComment(anyString(), anyString());
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = mock(CommentsConfiguration.class);
        when(commentsConfiguration.getAllComments()).thenReturn(commentsConfiguration);
        verify(commentsConfiguration).getAllComments();
    }

}