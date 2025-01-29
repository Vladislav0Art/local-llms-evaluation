package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCommentsConfigurationCommentLinesSetting {

    @Test
    public void commentsConfigurationCommentLinesSetting() {
        SettingsHolder settings = new SettingsHolder();
        String path = "path";
        Comment comment = new Comment("", "");
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(Collections.singletonMap(path, Arrays.asList(comment)));
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.setComment(path, comment));
    }

}