package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedSetCommentNoComment {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void setCommentNoComment() {
        // Arrange
        String path = "path";
        String...commentLines = {};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(0, comments.get(path).size());
    }

}