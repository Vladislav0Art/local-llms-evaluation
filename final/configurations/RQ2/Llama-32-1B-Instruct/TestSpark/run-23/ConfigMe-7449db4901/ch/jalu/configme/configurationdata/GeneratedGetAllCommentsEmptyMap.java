package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedGetAllCommentsEmptyMap {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void getAllCommentsEmptyMap() {
        // Arrange
        settingsHolder = Mockito.mock(SettingsHolder.class);
        comments = new HashMap<>();
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyList());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(0, settingsHolder.getAllComments().size());
    }

}