package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_setComment_NullPath_Test {

    public void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_setComment_NullPath_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        builder.setSettings(settingsHolder);
        CommentsConfiguration configuration = builder.build();
        config.setComment(null, "comment1\ncomment2");
        assertLinesEqual(configuration.getAllComments().get("path"), Collections.emptyList());
    }

}