package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testConstructor_Comments() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // Act
        String commentLines = "line1\nline2";
        config.setComment("path", commentLines);

        // Assert
        assertEquals(commentLines, Mockito.verify(config, Mockito.times(1)).setComment("path", commentLines));
    }

    @Test
    public void testConstructor_Comments_NoExistingComments() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // Act
        String commentLines = "line1\n";
        config.setComment("path", commentLines);

        // Assert
        assertEquals(commentLines, Mockito.verify(config, Mockito.times(1)).setComment("path", commentLines));
    }

    @Test
    public void testConstructor_Comments_SingleLineComment() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // Act
        String commentLines = "line1\n";
        config.setComment("path", commentLines);

        // Assert
        assertEquals(commentLines, Mockito.verify(config, Mockito.times(1)).setComment("path", commentLines));
    }

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

    @Test
    public void testGetAllComments_Comments() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.withComment("path", Arrays.asList("line1\nline2"));
        CommentsConfiguration updatedConfig = builder.build();

        // Act
        Map<String, @UnmodifiableView List<String>> result = updatedConfig.getAllComments();

        // Assert
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1\nline2")), Mockito.verify(result).getAllComments());
    }

}