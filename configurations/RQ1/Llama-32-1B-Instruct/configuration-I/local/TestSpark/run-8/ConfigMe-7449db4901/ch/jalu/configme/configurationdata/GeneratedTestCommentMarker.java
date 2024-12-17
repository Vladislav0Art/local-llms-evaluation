package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentMarker {

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