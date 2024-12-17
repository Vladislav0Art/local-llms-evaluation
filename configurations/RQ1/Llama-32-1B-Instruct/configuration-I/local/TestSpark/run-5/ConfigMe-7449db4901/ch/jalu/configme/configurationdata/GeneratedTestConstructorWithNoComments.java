package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestConstructorWithNoComments {

    @Test
    public void testConstructorWithNoComments() {
        SettingsHolder settings = new SettingsHolder();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder(settings);
        comments configurations = builder.build();
        assert !configurations.comments.isEmpty();
    }

}