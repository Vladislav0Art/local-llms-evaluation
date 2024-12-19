package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestConstructor_Comments_NoExistingCommentForPath {

    @Test
    public void testConstructor_Comments_NoExistingCommentForPath() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // Act
        String commentLines = "line1\n";
        config.setComment("path", commentLines);
        Mockito.when(Mockito.verifyAll()).thenThrow(new IllegalArgumentException("No existing comment for path 'path'"));

        // Assert
        Mockito.verifyAll(() -> {
            Mockito.when(config.getAllComments().get("path")).thenReturn(Collections.emptyList());
        }, Mockito.times(1));
    }

}