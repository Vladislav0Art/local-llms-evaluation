package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedCommentsConfigurationNewlineOnlySetComment {

    @Test
    public void commentsConfigurationNewlineOnlySetComment() {
        when(Mockito.anyString()).thenReturn(null);
        when(Mockito.any(String[].class)).thenReturn(null);
        CommentsConfiguration configuration = new CommentsConfiguration();
        try {
            configuration.setComment("path", null);
        } catch (Exception e) {
            fail("setComment");
        }
    }

}