package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_commentLinesAreNotSynchronized_Test {

    public void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_commentLinesAreNotSynchronized_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        builder.setSettings(settingsHolder);
        CommentsConfiguration configuration = builder.build();

        // Create two threads to modify the setComment method simultaneously
        Thread thread1 = new Thread(() -> config.setComment("path", "comment1\ncomment2"));
        Thread thread2 = new Thread(() -> config.setComment("path", "comment3\ncomment4"));

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Assert that the setComment method has been modified correctly
        assertLinesEqual(configuration.getAllComments().get("path"), Arrays.asList("comment1\ncomment2", "comment3"));
    }

}