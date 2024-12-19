package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAllComments_Comments {

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