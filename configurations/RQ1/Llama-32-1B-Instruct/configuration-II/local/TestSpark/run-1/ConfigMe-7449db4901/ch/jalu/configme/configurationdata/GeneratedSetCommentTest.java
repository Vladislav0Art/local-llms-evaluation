package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.configurationdata.LineConfiguration;
import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.configurationdata.Settings;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        LineConfiguration lineConfiguration = new LineConfiguration("path", Arrays.asList("line1\n", "line2"));
        SettingsHolder settings = new Settings(new SettingsHolder(), Collections.emptyMap());

        // Act
        comments.put("path", Arrays.asList(lineConfiguration));

        // Assert
        assertEquals(2, comments.size());
    }

}