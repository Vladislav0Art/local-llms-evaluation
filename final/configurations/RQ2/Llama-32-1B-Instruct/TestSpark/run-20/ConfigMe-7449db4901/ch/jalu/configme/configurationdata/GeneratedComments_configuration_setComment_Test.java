package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_setComment_Test {

    private void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_setComment_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build();
        config.setComment("path", "comment1\ncomment2");
        assertLinesEqual(configuration.getAllComments().get("path"), Arrays.asList("comment1", "comment2"));
    }

}