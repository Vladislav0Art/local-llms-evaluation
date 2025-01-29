package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCommentsConfigurationSetComment {

    @Test
    public void commentsConfigurationSetComment() {
        SettingsHolder settings = new SettingsHolder();
        settings.setComments(new CommentsConfiguration().comments);
        Assert.assertTrue(settings.getSettingsHolder().getComments().containsKey("path"));
        Assert.assertEquals(0, settings.getSettingsHolder().getComments().get("path").size());
    }

}