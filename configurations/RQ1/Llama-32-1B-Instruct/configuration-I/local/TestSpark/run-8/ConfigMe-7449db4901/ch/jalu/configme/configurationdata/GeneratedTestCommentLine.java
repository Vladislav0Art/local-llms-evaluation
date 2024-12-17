package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentLine {

    @Test
    public void testCommentLine() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act and Assert
        String path = "path1";
        @NotNull String...commentLines = {"\ncomment2"};
        configuration.setComment(path, commentLines);

        assertEquals(2, configuration.getAllComments().size());
    }

}