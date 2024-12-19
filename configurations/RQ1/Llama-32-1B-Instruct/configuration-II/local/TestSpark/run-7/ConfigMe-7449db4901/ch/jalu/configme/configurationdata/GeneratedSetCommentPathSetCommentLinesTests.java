package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetCommentPathSetCommentLinesTests {

    @Test
    public void setCommentPathSetCommentLinesTests() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.emptyList());
        String[] commentLines = {"line1\nline2"};
        List<String> lines = Arrays.asList(commentLines);

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "line3");

        // Act
        List<String> commentedLines = configuration.getComment("path");

        // Assert
        assertEquals(2, commentedLines.size());
    }

}