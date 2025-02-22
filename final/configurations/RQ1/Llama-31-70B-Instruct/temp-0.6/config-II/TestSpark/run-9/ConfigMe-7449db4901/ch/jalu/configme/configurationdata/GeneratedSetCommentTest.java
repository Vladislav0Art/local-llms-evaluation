package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = mock(CommentsConfiguration.class);
        when(commentsConfiguration.setComment(anyString(), anyString())).thenReturn(commentsConfiguration);
        verify(commentsConfiguration).setComment(anyString(), anyString());
    }

}