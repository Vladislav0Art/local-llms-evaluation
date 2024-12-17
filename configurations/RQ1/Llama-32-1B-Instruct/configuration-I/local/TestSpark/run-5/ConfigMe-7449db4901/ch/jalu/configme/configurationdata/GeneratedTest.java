package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTest {

    public static SettingsHolder buildTests() {
        return new SettingsHolder();
    }

    public void testConstructorWithoutComments() {
        SettingsHolder settings = buildTests();
        assert !CommentsConfiguration.getComments().isEmpty();
    }

    public void testConstructorWithComments() {
        SettingsHolder settings = buildTests();
        CommentsConfiguration comments = CommentsConfigurationBuilder.create(settings).build();
        assert !comments.isEmpty();
    }

}