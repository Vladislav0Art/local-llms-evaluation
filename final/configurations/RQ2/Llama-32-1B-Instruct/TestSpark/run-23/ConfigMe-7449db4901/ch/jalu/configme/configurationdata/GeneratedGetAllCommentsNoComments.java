package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedGetAllCommentsNoComments {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void getAllCommentsNoComments() {
        // Arrange
        settingsHolder = Mockito.mock(SettingsHolder.class);
        comments = Collections.emptyList();

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(0, settingsHolder.getAllComments().size());
    }

}