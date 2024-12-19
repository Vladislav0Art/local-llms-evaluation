package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedGetCommentLinesConstructorTests {

    @Test
    public void getCommentLinesConstructorTests() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.emptyList());
        String[] commentLines = {"line1\nline2", "line3"};

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Assert
        assertEquals(commentLines, configuration.getComment("path"));
    }

}