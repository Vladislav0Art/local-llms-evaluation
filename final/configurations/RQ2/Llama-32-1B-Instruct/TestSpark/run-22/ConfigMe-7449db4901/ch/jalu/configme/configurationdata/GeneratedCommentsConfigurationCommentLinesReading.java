package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCommentsConfigurationCommentLinesReading {

    @Test
    public void commentsConfigurationCommentLinesReading() {
        SettingsHolder settings = new SettingsHolder();
        String path = "path";
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(Collections.singletonMap(path, Collections.singletonList(comment)));
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getAllComments().containsKey("path"));
        Assertions.assertEquals(1, config.getAllComments().get("path").size());
    }

}