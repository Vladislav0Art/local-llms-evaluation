package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedGetAllComments_MutableMap {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void getAllComments_MutableMap() {
        // Arrange
        comments = new HashMap<>();
        comments.put("path", Collections.singletonList("line1"));

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(1, comments.size());
        assertEquals(1, comments.get("path").size());
    }

}