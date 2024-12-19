package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.configurationdata.LineConfiguration;
import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.configurationdata.Settings;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class GeneratedGetCommentTest {

    @Test
    public void getCommentTest() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        LineConfiguration lineConfiguration = new LineConfiguration("path", Arrays.asList("line1\n", "line2"));
        SettingsHolder settings = new Settings(new SettingsHolder(), Collections.emptyMap());

        // Act
        Map<String, List<String>> commentList = comments.get("path");

        // Assert
        assertEquals(2, commentList.size());
    }

}