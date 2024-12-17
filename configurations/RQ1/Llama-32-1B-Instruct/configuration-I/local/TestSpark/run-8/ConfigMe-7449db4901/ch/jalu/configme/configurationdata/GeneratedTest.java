package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testCommentsConstructor() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act
        String path = "path1";
        String commentLines = Arrays.asList("comment2");

        // Assert
        assertEquals(2, configuration.comments.size());
    }

    @Test
    public void testCommentsSetComment() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act
        String path = "path1";
        String commentLines = Arrays.asList("comment2");

        // Assert
        assertEquals(2, configuration.comments.size());
    }

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

    @Test
    public void testCommentMarker() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Act and Assert
        String path = "path1";
        @NotNull String...commentLines = {"\n", ""};

        assertEquals(2, configuration.getAllComments().size());
    }

}