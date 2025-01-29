package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCommentsConfigurationConstructors {

    @Test
    public void commentsConfigurationConstructors() {
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.comments == null);
        Assertions.assertTrue(config.comments instanceof Map);

        CommentsConfiguration comments = Mockito.mock(CommentsConfiguration.class);
        Mockito.when(comments.getComments()).thenReturn(Collections.singletonMap("path", Arrays.asList("line1", "line2")));
    }

}