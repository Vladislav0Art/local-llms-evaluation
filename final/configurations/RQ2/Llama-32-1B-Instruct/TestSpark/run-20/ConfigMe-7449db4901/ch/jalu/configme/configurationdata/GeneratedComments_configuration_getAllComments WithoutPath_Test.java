package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_getAllComments WithoutPath_Test {

    private void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_getAllComments

    WithoutPath_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        builder.setSettings(settingsHolder);
        CommentsConfiguration configuration = builder.build();
        Map<String, List<String>> expected = Collections.emptyMap();
        assertEquals(expected, configuration.getAllComments());
    }

}