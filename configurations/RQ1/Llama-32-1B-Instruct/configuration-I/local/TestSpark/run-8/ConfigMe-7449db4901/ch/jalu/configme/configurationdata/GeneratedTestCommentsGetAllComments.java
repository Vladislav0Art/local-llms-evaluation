package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentsGetAllComments {

    @Test
    public void testCommentsGetAllComments() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act
        String path = "path1";
        String commentLines = Arrays.asList("comment2");

        // Assert
        assertEquals(2, configuration.getAllComments().size());
    }

}