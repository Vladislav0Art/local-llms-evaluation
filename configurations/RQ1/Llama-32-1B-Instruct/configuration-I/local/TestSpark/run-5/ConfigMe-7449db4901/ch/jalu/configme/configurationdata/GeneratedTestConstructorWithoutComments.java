package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestConstructorWithoutComments {

    @Test
    public void testConstructorWithoutComments() {
        SettingsHolder settings = new SettingsHolder();
        CommentsConfiguration commentsConfigurations = buildTests(settings);
        assert !commentsConfigurations.comments.isEmpty();
    }

    private CommentsConfiguration buildTests(SettingsHolder settings) {
        return new CommentsConfiguration(settings);
    }

}