package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_getAllCommentsWithoutPath_Test {

    public void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_getAllCommentsWithoutPath_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        builder.setSettings(settingsHolder);
        CommentsConfiguration configuration = builder.build();
        Map<String, List<String>> expected = Collections.emptyMap();
        assertEquals(expected, configuration.getAllComments());
    }

}