package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNoCommentLine {

    @Test
    public void testNoCommentLine() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act and Assert
        String path = "path1";
        @NotNull String...commentLines = {"comment3"};

        assertEquals(0, configuration.getAllComments().size());
    }

}