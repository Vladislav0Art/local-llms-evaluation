package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestConstructor_Comments {

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

}