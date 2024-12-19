package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedSetComment_PathComments {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_PathComments() {
        // Arrange
        String path = "path1";
        String[] commentLines = {"comment1", "\ncomment2"};
        Mockito.when(settingsHolder.registerComments(path)).thenReturn(Collections.unmodifiableList(Arrays.asList(commentLines)));

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);

        // Assert
        Mockito.verify(settingsHolder).registerComments(path);
    }

}