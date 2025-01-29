package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedSetComment_MultipleLine commentLines {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void setComment_MultipleLine

    commentLines() {
        // Arrange
        String path = "path";
        String...commentLines = {"line1", "", ""};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentLines.length, comments.get(path).size());
    }

}