package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedCommentsConfigurationMultipleCommentsSetComment {

    @Test
    public void commentsConfigurationMultipleCommentsSetComment() {
        when(Mockito.anyString()).thenReturn(null);
        when(Mockito.any(String[].class)).thenReturn(null);
        CommentsConfiguration configuration = new CommentsConfiguration();
        try {
            configuration.setComment(null, null);
        } catch (Exception e) {
            fail("setComment");
        }
    }

}